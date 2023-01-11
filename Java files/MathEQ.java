import java.util.Scanner;

public class MathEQ 
{
    public static void main(String [] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double rP1 = 0, rP2top = 0 ,rP2bottom = 0 ,  rP3top = 0, rP3bottom = 0 , A = 0 , B = 0 , C = 0 ;

    
    System.out.println("What is A?: ");
    A = keyboard.nextDouble();
    
    
    System.out.println("What is B?: ");
    B = keyboard.nextDouble();
    
    
    System.out.println("What is C?: ");
    C = keyboard.nextDouble();
    
    rP1 = (A * B);
    
    rP2top = (B - A);
    rP2bottom = (3*B);
    
    rP3top = Math.pow(C,B+2);
    rP3bottom = A - (2*B);
    
    
    
    
    System.out.println("The answer is "  + (rP1 + (rP2top/rP3bottom) + (rP3top/rP3bottom)));
    System.out.println("rP1 " + rP1);
    System.out.println("rP2top " + rP2top);
    System.out.println("rP2bottom " + rP2bottom);
    System.out.println("P3top " + rP3top);
    System.out.println("rP3bottom " + rP3bottom);
    }
}
