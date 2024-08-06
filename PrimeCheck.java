
import java.util.Scanner;

public class PrimeCheck
{
public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       int iNumMax = 0 ;
       String  primeNumbers = "";
       Scanner keyboard = new Scanner(System.in);

       System.out.println("Until what number would you like to calculate primes? ");
       iNumMax = keyboard.nextInt();




       for (i = 0; i <= iNumMax ; i++)
       { 		  	  
            int counter=0; 	  
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                counter = counter + 1;
                }
            }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to "+ iNumMax +" are :");
       System.out.println(primeNumbers);

/* ==POTENTIALLY FASTER==
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int limit = scanner.nextInt();
        
        System.out.println("Prime numbers up to " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

*/




    }
}		
