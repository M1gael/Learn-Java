import java.io.*;// for FileWriter , PrintWriter and IOExeption

public class WriteToTextfile {
        public static void main(String[] args) throws IOException {
        
        // Specify filepath.
        String filePath = "path_to_file/data.txt";

        //Instance fileWriter 
        FileWriter fWriter = new FileWriter(filePath);

        //Wrap FileWriter in PrintWriter
        PrintWriter pWriter = new PrintWriter(fWriter);
        /* NOTE
            PrintWriter class provides print methods (such as println()) which are easier and more efficient than using write() method in FileWriter directly.
        */

        //Write data to a file
        pWriter.println("hello world");
        
        pWriter.close();
    }
}
