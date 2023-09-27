import java.util.Scanner;
package Tests.ST2_2023_09_29;

public class Q4 {   

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sLine = kb.nextLine();

        char[] arLine = new char[sLine.length()];
        
        for (int i = 0 ; i < sLine.length() ; i++){
            arLine[i]= sLine.charAt(i);
        }

        for (int i = 0 ; i < arLine.length ; i++){
            if (i % 5 == 0){
                arLine[i] = '*';
            }
        }
        for (int i = 0 ; i < arLine.length ; i++){
            System.out.print(arLine[i]);
        }

    }
}
