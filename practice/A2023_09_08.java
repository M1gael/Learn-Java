
package practice;

import java.util.Random;
import java.util.Scanner;



public class A2023_09_08 {

    public static void displayAllStudents(int[] studentNo, int[] Marks , String[] results){
        for(int i = 0 ; i < studentNo.length; i++){
            System.out.println("Student Number: " + studentNo[i]); 
            System.out.println("Their MarkL: " + Marks[1]);
            if (Marks[i] >= 50){
                System.out.println("Passed");
            }else{
                System.out.println("Fails");
            }
        }
    } 



    public static int searchStudent(int studentNr , int[] studentNo){
        for(int i = 0 ; i < studentNo.length ; i++){
            if (studentNr == studentNo[i]){
                return studentNo[i]
            }
        }
    }


    public static void main(String[] args){
        Random random = new Random();
        Scanner kb = new Scanner(System.in);

        int[] studentNo = new int[5];

        studentNo[0] = 20201234;
        studentNo[1] = 21568955;
        studentNo[2] = 20612356;
        studentNo[3] = 20915642;
        studentNo[4] = 20221234;


        int[] Marks = new int[5];

        Marks[0] = random.nextInt(101);
        Marks[1] = random.nextInt(101);
        Marks[2] = random.nextInt(101);
        Marks[3] = random.nextInt(101);
        Marks[4] = random.nextInt(101); 


        String[] results = new String[5];


        displayAllStudents();

        System.out.println("Enter the student number you want to search for: ");
        displaySearchStudent(kb.nextLine());
        displaySearchResults();
        determineClassAverage();
        determineHighestStudent();
        displayHighestStudent();
        sortArray();

        
    }



}