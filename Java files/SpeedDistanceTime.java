
import java.util.Scanner;

public class SpeedDistanceTime
	{
    public static void main(String[] args)
	{

    int iSpeed , iDistance , iTime ;
    Scanner keyboard = new Scanner(System.in);		

    System.out.println("What is the speed?");
    iSpeed = keyboard.nextInt();
   
    
    System.out.println("What is the Time?");
    iTime = keyboard.nextInt();
        
    iDistance = iTime*iSpeed;


    System.out.println("The distance you have to travel is "+ iDistance);
    }
    }
