import java.util.Scanner;

public class IfElse2
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    int iCurrentSalary = 0 ;
    char cCurrentDept = 'A';
    
    System.out.println("What is your salary? : ");
    iCurrentSalary = keyboard.nextInt();
    System.out.println("What department are you specialised in? : ");
    cCurrentDept = keyboard.next().charAt(0);
    
        if (cCurrentDept == 'C')
        {
        System.out.println("Your Salary Increase Will Be 10%");
        System.out.println("Your New Salary Will Be " + (iCurrentSalary + iCurrentSalary*0.1));
        }
            else
            {
                if (cCurrentDept == 'A')
                {
                System.out.println("Your Salary Increase Will Be 8%");
                System.out.println("Your New Salary Will Be " + (iCurrentSalary + iCurrentSalary*0.08));
                }
                    else
                    {
                    System.out.println("There is no such department");
                    }       
            }
    }
    
}
