import java.util.Scanner;

public class Pills
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    
    int iPills = 0 , iBig = 0, iSmall = 0 , iRes = 0 , iRecount = 0;
   
    System.out.println("How many tablets need to be stored? ");
    
    iPills = keyboard.nextShort();
    
    iBig = iPills/250;
    iPills = iPills - (iBig*250);   
    iSmall = (iPills)/15 ;
    iPills = iPills - (iSmall * 15);
    iRes = (iPills) ;
    
    iRecount = iRes + (iBig*250) + (iSmall*15);
    
    
    System.out.println("Large pill containers containing 250 Tablets :" + iBig);
    System.out.println("Small pill containers containing 15 tablets :" + iSmall);
    System.out.println("Remaining unused tablets :" + iRes);
    //System.out.println("Recounting :" + (iBig*250) +(iSmall*15) + iRes);
    System.out.println("Recounted Pills " + iRecount);    
    }
}
