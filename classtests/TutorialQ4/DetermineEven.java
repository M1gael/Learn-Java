package com.example.myproject;
import java.util.Scanner;

public class DetermineEven{

    public static boolean findEven(int int1 ,int int2){
        if ((int1 % 2 == 0)&&(int2 % 2 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
                                      //  *Changed to Boolean input*
    public static void displayResults(boolean result){ //How did you expect someone to use string as an input to method when findEven only returns boolean?   
        if (result == true){
            System.out.println("Both numbers are even!");
        }
        else{
            System.out.println("Not both numbers are even!")
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What is the first number? : ");

        int num1 = kb.nextInt();

        System.out.print("What is the second number? : ");

        int num2 = kb.nextInt();
        
        boolean isEven = findEven(num1 , num2);     //method can only return boolean 
        displayResults(isEven);                     //boolean sent to display result

    }
}