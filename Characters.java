
import java.util.Scanner;

public class Characters
{
	public static void main(String[] args)
	{
        int digitCount = 0 , charCount = 0 ; 
        String Line = " ";
        char cSym =' ';
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your string of characters : ");
        Line = kb.nextLine();
        kb.close();

        for (int i = 0 ; i < Line.length() ; i++){
            cSym = Line.charAt(i);

            if(Character.isDigit(cSym)){
                System.out.println(cSym + " is a Digit!");
                digitCount++;
            }else{
                System.out.println(cSym + " is a Character!");
                charCount++;
            }
        }

        System.out.println("There were " + charCount + " Characters , and " + digitCount + " digits!");
    }
}		
