import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class FileManipulationText{
    public static void main (String []args){
        //declare and initialize the file to be used
        String filePath = "example.txt";
        
        //Read the file and store the lines in an arraylist
        List<String> lineList = readFileToList(filePath);
        
        //Print the lines to verify
        for (String line : lineList){
            System.out.println(line);
        }
    }
    
    public static List<String> readFileToList(String filePath){
        // Create another list to store the lines within this method
        List<String> lines = new ArrayList<>();
        String line;

        // Use a try-with-resources to ensure the bufferreader is closed propperly
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            // Set line to whatever the buffer reads and continue the loop as long as not NULL
            while ((line = br.readLine()) != null){
                lines.add(line);
            }
        }
        catch(IOException e){
            System.out.println("An error occurred while reading the file.");
        }
        return lines;
    }
}