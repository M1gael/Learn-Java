import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {

        //Declare a string , character and int index that will specify where the char gets its value within the String
        String theString = null , finalMessage = null ;
        char theChar = ' ';
        int index = 0;

        Random rand = new Random(); //Random
        Scanner kb = new Scanner(System.in);

        //Random index will be generated
        index = rand.nextInt(51);

        System.out.println("Enter a string: ");
        theString = kb.nextLine();

        
        try {//Try to get a char at the random index of the string
            theChar = theString.charAt(index);
            finalMessage = ("The character " + theChar + " was located at index " + Integer.toString(index));
        } catch (StringIndexOutOfBoundsException e) { //Catch the expected exeption if that does not work
            finalMessage = "There is no character at the random index of the string.";
        }

        System.out.println(finalMessage);


    }
}
