public class SwitchFallthrough 
{


    public static void main(String args[]) 
    {
       // char grade = args[0].charAt(0);
       char grade = 'B';
 
       switch(grade) 
       {
          case 'A' :
             System.out.println("Excellent!");
             break;
          case 'B' :
          case 'C' :                                                //Maak dat B en C dieselfde Result gaan gee
             System.out.println("Well done");
             break;
          case 'D' :
             System.out.println("You passed");
          case 'F' :
             System.out.println("Better try again");
             break;
          default :
             System.out.println("Invalid grade");
       }
       System.out.println("Your grade is " + grade);
    }
 }