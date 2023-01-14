import java.util.Scanner;

public class PoolPer
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		Double rArea , rPer , rLength , rWidth ;
		
		System.out.println("What is the width of the pool? ");
		rWidth = keyboard.nextDouble();
		
		
		System.out.println("What is the length of the pool? ");
		rLength = keyboard.nextDouble();
	
		
		rArea = (rLength * rWidth);
		rPer = (rLength * 2 ) + (rWidth * 2);
		
		System.out.println("The area of the pool is "+ rArea + " Meter Square");
		System.out.println("The perimiter of the pool is "+ rPer + " Meter");
		
		
	
	
	
	
	
	}
	}