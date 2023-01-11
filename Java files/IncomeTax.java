import java.util.Scanner;

public class IncomeTax 
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    
    double rHoursWorked = 0 ,rGross = 0 , rTaxed = 0 ,rNetto = 0;
    final int WAGE = 500 , WAGE_OVERTIME = 115 ;
    final double TAX = 0.225;
    
    System.out.println("How many hours did bozo Work? ");
    
    rHoursWorked = keyboard.nextDouble();
    rGross = WAGE + ((rHoursWorked-5)*WAGE_OVERTIME);
    rTaxed = rGross*TAX ;
    rNetto = rGross - rTaxed ; 
    
    System.out.println("Bozo worked for " + rHoursWorked + " hours");
    System.out.println("He earned a total of R" + rGross);
    System.out.println("His tax ammount was R" +rTaxed);
    System.out.println("His netto sallary is R" +rNetto);
    
    
    }
    
}
