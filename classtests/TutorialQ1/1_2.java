package classtests.TutorialQ1;
import java.util.Scanner;

public class 1_2 {
    public static int CalculateTicketPrice(int ticketCount){
    int ticketPrice = 0;

    if (ticketCount < 5){
        ticketPrice = 125;
    }
    else if (ticketCount >= 5 && ticketCount <= 24){
        ticketPrice = 100;
    }
    else if (ticketCount >= 25){
        ticketPrice = 90;
    }

    ticketPrice = ticketPrice*ticketCount;
    
    return ticketPrice;
}

    public static void main(String[] args){
        int ticketAmount = 0 ; 
        Scanner kb = new Scanner(System.in);

        System.out.print("How many tickets would you like to buy?: ");
        ticketAmount = kb.nextInt();

        System.out.println("Your total ticket price will be: R" + CalculateTicketPrice(ticketAmount));
    }
}
