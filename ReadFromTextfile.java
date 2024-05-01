import java.io.*; // For FileReader , Buffered Reader , and IOExeption
//Import the nessecary libraries.

public class ReadFromTextfile {
                                            // catch IOExeption , so that compiler will know that this exception is handled elsewhere in the code.
    public static void main(String[] args) throws IOException {
        
        // Specify filepath.
        String filePath = "path_to_file/data.txt";

        //Instance filereader 
        FileReader fReader = new FileReader(filePath);

        //Wrap FileReader in BufferedReader
        BufferedReader bReader = new BufferedReader(fReader);
        /* NOTE
        File reader reads one line at a time
        while BufferedReader stores characters into a buffer
         */

        String line;
        //Read file line by line until the end of the file is reached.
        while ((line = bReader.readLine()) != null){ //The bReader holds a buffered copy of txtfile
            System.out.println(line);
            //Print each line to terminal
        }
        
        //Close resources after using them to prevent memory leaks
    }
}
