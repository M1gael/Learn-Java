import java.util.Scanner; 

public class PalindromeIfForloopString {
    
public static void main(String[] args){

    String sLine = "" ;
    boolean isPalindrome = true;

    Scanner kb = new Scanner(System.in);

    System.out.println("Enter a 3 digit number");

    sLine = kb.nextLine();

    while (sLine.length() != 3) {
        System.out.println("Invalid number , ensure that you have no less or more than 3 numbers. Please enter a number:");

        sLine = kb.nextLine();
    }
 
    for (int i=0 ; i<sLine.length() /2 ; i++ ) {
        if (sLine.charAt(i) != sLine.charAt(sLine.length() - 1 - i)) {
            isPalindrome = false;
            break;
        }      

    } 
    if (isPalindrome = true) {
        System.out.println(sLine + "is a palindrome"); 
    }
        else{
        System.out.println(sLine + "is not a palindrome");
        }
   
} 
}











