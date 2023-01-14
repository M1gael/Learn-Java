
import java.util.Scanner;
import javax.swing.*;

public class FirstGui
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("firts gui");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		
		JButton button1 = new JButton("Button 1");
		frame.getContentPane().add(button1);

		JButton button2 = new JButton("Button 2");
		frame.getContentPane().add(button2);
		
		frame.setVisible(true);








    }
}		
