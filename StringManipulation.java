
import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String line = "i have a R50 and R70 got" , sNum = "";
        int iNum = 0;

        for(int i = 0 ; i < line.length() ; i++){

            if ( Character.isDigit(line.charAt(i)) ) {
                sNum = sNum +line.charAt(i);
            }
            else {
                if (!sNum.isEmpty()){
                    iNum = iNum + Integer.parseInt(sNum);
                    sNum = "";
                }
            }
        }
        System.out.println("The total ammount you have is: R" + iNum);
    }
}


