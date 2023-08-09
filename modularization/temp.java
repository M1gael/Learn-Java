package modularization;

import java.util.Scanner;

public class temp {


    public static int CalculateSum(int number1 , int number2){
        int sum = number1 + number2 ;
        return sum;
    }

    public static void main(String[] args){
        int num1 = 0 , num2 = 0 ;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        num2 = kb.nextInt();

        System.out.println("The sum is " + CalculateSum(num1, num2));
    }
}

