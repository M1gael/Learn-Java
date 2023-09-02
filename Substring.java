import java.util.Scanner;
public class Substring {
    
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String newSentence = " ";
        System.out.print("Enter a String of witch the first 3 letters will be used to make a substring.");
        
        String sentence = kb.nextLine();
        newSentence = sentence.substring(0, 3);//First char [0] , +the number of characters we want  [3]
        // or sentence.substring(3) but it takes everything from 3 and until the end of the string

        System.out.println(newSentence);

    
    
    }
}
