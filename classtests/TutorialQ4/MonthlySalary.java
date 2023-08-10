package com.example.myproject;
import java.util.Scanner;


public class MonthlySalary{

    public static double calcMonthly(double anualAmmount){
        return anualAmmount/12;
    }

    public static void displaySalary(double monthlyAmmount){
        System.out.print("Your monthly salary is : R" + monthlyAmmount);
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your annual salary? : ");
        double anualSalary = kb.nextDouble();                   kb.nextLine(); // clearing remaining newline characters
        double monthlySalary = calcMonthly(anualSalary);
        displaySalary(monthlySalary);
    }
}