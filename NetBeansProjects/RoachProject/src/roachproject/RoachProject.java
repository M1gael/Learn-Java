
package roachproject;

import javax.swing.JOptionPane;

public class RoachProject {

    public static void main(String[] args) {
        RoachPopulation myHouse = new RoachPopulation();
        myHouse.setPopulation(20);
        myHouse.doubling();
        myHouse.spray();
        
        int thePopulation = myHouse.getPopulation();
        String message = "The roach population is " + thePopulation;
        JOptionPane.showMessageDialog(null, message);
    }
    
}
