
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;

public class FirstGui2
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Chat with yourself");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		
		JMenuBar mb = new JMenuBar();				//Physical menu bar space no buttonss
		
		JMenu m1 = new JMenu("File");				//Adding Physical buttons to menubar
		JMenu m2 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);		
		
		JMenuItem m11 = new JMenuItem("Open");		//Create option for menu
		JMenuItem m12 = new JMenuItem("Save as");
		m1.add(m11);								//Add otion to specific menu
		m1.add(m12);
		m12.addActionListener(e);
		JTextArea ta = new JTextArea();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter Text");
		JTextField tf = new JTextField(10);				//Limited to 10 Characters
		FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
		JButton send = new JButton("Send");             
			send.addActionListener(e ->
			{
			ta.append("Mig : " + tf.getText());
			ta.append("\n");
			});
		
	
		JButton reset = new JButton("Reset");
			reset.addActionListener(e ->
			{
			ta.write(fw);
			});

		panel.add(label);
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		panel.add(ta);

		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);

		/////////////////////////////////////////////////////////////////////////////////////








    }
}		
