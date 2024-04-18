import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.
//import the nessecary libraries 

public class SwingFirstGui_2 {

    public static void main(String[] args) {
        
        JFrame appFrame = new JFrame("My JFrame");
        //Create an instance of the JFrame
        appFrame.setSize(400 , 300);
        //(Optional) Set the Size of the frame (W , H)
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Good Practice to specify what happens when the user closes the window


        //A JFrame can hold Swing components like buttons , labels or text Fieldss
        //Create these elements first before you can add them
        JButton myButton = new JButton("Click Me");
        JTextField nameField = new JTextField(20); //Sets width to 20 char
        JLabel messageLabel = new JLabel("Welcome!");
        JTextArea commentArea = new JTextArea(5, 20);  // Sets initial size (5 rows, 20 columns)

        JPanel group1Panel = new JPanel();
        //Use the JPanel class to create container panels for organizing other components.

        myButton.setForeground(Color.RED);
        //Customizing Elements
        
        
    }

}
