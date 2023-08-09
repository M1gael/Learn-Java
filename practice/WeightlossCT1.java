package practice;

import java.util.Scanner;

public class WeightlossCT1{

    public static void main(String[] args){
        double rWeightCurrent = 0.0 , rWeightTotal = 0.0 ;
        int iTotMonths = 0;
        Scanner kb  = new Scanner(System.in);

        for (int i = 1 ; i<=12 ; i++){
            System.out.print("Enter your weight loss for month " + i + " in kg : ");
            
            rWeightCurrent = kb.nextDouble();
            rWeightTotal = rWeightTotal + rWeightCurrent;

            if (rWeightCurrent > 3.5) {
                System.out.println("Your weight loss is above average this month. ");
                iTotMonths++;
            }
        }
        
        System.out.println("Your total weight loss is " + rWeightTotal + "kg");
        System.out.println("In " + iTotMonths + " month(s) you lost more than the average weight. ");

    }

}
