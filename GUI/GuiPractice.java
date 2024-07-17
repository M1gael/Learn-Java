package GUI;
import javax.swing.*;
public class GuiPractice {
    public static void main(String[] args){

        JFrame mainFrame = new JFrame("Mainframe Title");

        mainFrame.setSize(400 , 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Click Me");
        JLabel label1 = new JLabel("Im a label");
        JTextArea ta1 = new JTextArea(5 , 20);


        JPanel pnlDisplay = new JPanel();
        

        pnlDisplay.add(button1);
        pnlDisplay.add(button1);

        mainFrame.getContentPane().add(pnlDisplay);
        mainFrame.setVisible(true);
    }
}
