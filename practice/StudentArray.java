package practice;
import java.util.Scanner;

public class StudentArray {

    public static void displayAllMarks(int[] marks){
        for (int i = 0 ; i < marks.length ; i++){
            System.out.println("Student " + (i+1) + "has a mark of :" + marks[i]);
        }
    }
    


    public static void displayAverage(int[] marks){
        int sum = 0;

        for(int i = 0 ; i < marks.length ; i++){
            sum = sum + marks[i];
        }
        System.out.println("The average is : "+(sum / marks.length));
    }



    public static void determineLargest(int[] marks){
        int current = 0 , pos = 0;

        for(int i = 0 ; i < marks.length ; i++){
            if (marks[i] > marks[i+1]){
                current = marks[i];
                pos = i;
            } else {
                current = marks[i+1];
                pos = i + 1;                
            }
        }
        System.out.println("The largest number is " + current);
    }



    public static void main(String[] args){
        int[] marks = new int[5];
        Scanner kb = new Scanner(System.in);

        for(int i = 0 ; i < marks.length ; i++){
            System.out.println("Please enter the mark for student " + (i+1) +": ");
            int input = kb.nextInt();

            if (input>=0 && input<=100){
                marks[i] = input;
            } else {
                System.out.println("invalid Value");
                i--;
            }
        }
        displayAllMarks(marks);
        System.out.println("");
        displayAverage(marks);
        System.out.println("");
        determineLargest(marks);
    }
}
