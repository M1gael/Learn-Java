
import java.util.Scanner;

public class CaseWhileForLoop
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	int iNumSessions = 0 ;
    boolean again = true  ;
	char cChoice = 'A';

   System.out.println("How many Sessions would you like ? , Choose between 1 , 2 and 3 ?");
   iNumSessions = kb.nextInt();

   while (again == true)  
   {
  
    again = false;                                                               //"\n"  "\t"
	
    switch(iNumSessions) 
       {
        case 1 : break;
          
		  case 2 : break;
          
		  case 3 : break;
         
          default :
             System.out.println("Invalid Input please re enter a value .");
             again = true;
       }
      
   }
   
   System.out.println("Options/tSubjects/tHours per session");
   System.out.println("A   Programming    2");
   System.out.println("B   Math  1.5");
   System.out.println("C   English  1");
   System.out.println("Choose a corrosponding subject letter . A,B or C");
   cChoice = kb.next().charAt(0);
    

    for(int i=0 ;i<1;i++)
    {      
            switch(cChoice) 
            {
            
            case 'A' :
             System.out.println("Your total hours will be " +(iNumSessions)*2);
             break;
          
            case 'B' :
            System.out.println("Your total hours will be " +(iNumSessions)*1.5);
             break;
          
            case 'C' :
             System.out.println("Your total hours will be " +(iNumSessions)*1);
             break;
          
            default :
             i = i -1 ;
             System.out.println("Invalid re enter a valid option , A , B or C");
             cChoice = kb.next().charAt(0);
            
            }

   }  

   }
}		
