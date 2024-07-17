import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GuiSwingBasic{

    public static void main(String []args){

        //Create a JFrame (Jframes are top level containers that holds all components of gui)
        JFrame frame = new JFrame("My First Swing Application");
        frame.setSize(400, 400); //set size of frame
        
        //Add swing components with layout manager such as FlowLayout or GridLayout
        JButton button = new JButton("Click Me");
        frame.add(button);

        //Make the frame visible once all elements are added
        frame.setVisible(true);

        //Add eventhandler ActionListener to button
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //Custom event here
            }
        });
    }
}