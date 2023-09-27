package classtests.TutorialQ2;
import java.util.Scanner;

public class 2_3 {
    
    public static int calcPeri(int x , int y){
        int area = (2*x)+(2*y);
        return area;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = kb.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = kb.nextInt();

        System.out.println("The area of the rectangle is : " + calcPeri(length , width));
    }
}
