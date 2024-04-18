package swingfirstgui;
//Import Swing
import javax.swing.*;

public class SwingFirstGui {

    public static void main(String [] args){

    /*
    The methods of the JOptionPane class will allow you to create dialog boxes to:
     Display information to the user
     Request information from the user
     Give a user a choice with buttons

     EXAMPLE:
     showConfirmDialog Asks a confirming question, like yes/no/cancel.
     showInputDialog Prompt for some input.
     showMessageDialog Tell the user about something that has happened.



    JOptionPane.showMessageDialog(null, “Hallo World!”, “Greetings,JOptionPane.INFORMATION_MESSAGE);
     
    Parameters:
   - parentComponent (Object): This can be used to specify the parent component of the dialog box. 
       Currently, it's set to null, which creates a default dialog in the center of the screen.
   - messageStringExpression (String): The message to be displayed in the dialog box. 
   - boxTitleString (String): The title of the dialog box.
   - messageType (int): An integer representing the type of icon to display. You can also use 
       JOptionPane options (e.g., JOptionPane.INFORMATION_MESSAGE) for convenience. 
 
    

    You have the following options for JOptionPane:
    * javax.swing.JOptionPane.ERROR_MESSAGE        The error icon is displayed in the dialog box.

    * javax.swing.JOptionPane.INFORMATION_MESSAGE  The information icon is displayed in the dialog box.

    * javax.swing.JOptionPane.PLAIN_MESSAGE         No icon appears in the dialog box.

    * javax.swing.JOptionPane.QUESTION_MESSAGE      The question icon, question mark, is displayed in the dialog box.

    * javax.swing.JOptionPane.WARNING_MESSAGE       The warning icon, the exclamation point, is displayed in the dialog box.
    
    Note the overloaded showMessageDialog() methods that can be used:
    showMessageDialog(Component parentComponent, Object message)
    showMessageDialog(Component parentComponent, Object message, String title,int messageType)
    */  


    JOptionPane.showMessageDialog(null , "Its all Ogre now" , "Catastrophic Error" , JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null , "My Information: "+ "\n" + "Mig" + "\n" + "Smit" , "My Information" ,  JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null , "Note that there is no icon." , "Plain Message" ,JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null , "Are you (M)ale or (F)emale?" ,"Gender", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog(null , "You forgot to build the project!" , "Warning", JOptionPane.WARNING_MESSAGE);
    
    
    /*
    Previosly we used the Scanner class to get input from the user. Now we will use the
    showInputDialog() method.
    You will note that the method is of type static, which means we have to use
    the class name to reference the method, just like the showMessageDialog()method.
    */
    
    
    }
}