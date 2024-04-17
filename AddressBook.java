
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class AddressBook extends JFrame implements ActionListener {

  private final String fileName = "addressbook.txt"; // Placeholder for file (not used)
  
  public AddressBook() {
    super("Address Book");

    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder("Contact Information"));
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


    panel.add(new JLabel("First Name:"));
    JTextField firstNameField = new JTextField(20);
    firstNameField.setEditable(false); // Disable editing for display only
    panel.add(firstNameField);

    panel.add(new JLabel("Last Name:"));
    JTextField lastNameField = new JTextField(20);
    lastNameField.setEditable(false); // Disable editing for display only
    panel.add(lastNameField);

    panel.add(new JLabel("Phone Number:"));
    JTextField phoneNumberField = new JTextField(20);
    phoneNumberField.setEditable(false); // Disable editing for display only
    panel.add(phoneNumberField);

    JButton addButton = new JButton("Add Contact"); // Disabled for display only
    addButton.setEnabled(false);
    panel.add(addButton);

    JButton saveButton = new JButton("Save Contacts"); // Disabled for display only
    saveButton.setEnabled(false);
    panel.add(saveButton);

    JTextArea contactArea = new JTextArea();
    contactArea.setEditable(false); // Disable editing for display only
    JScrollPane scrollPane = new JScrollPane(contactArea);
    panel.add(scrollPane);

    // Add panel to frame and display
    add(panel);
    pack();
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // Not implemented - No functionality needed for display
  }

  // Other methods (readContactsFromFile, saveContactsToFile, addContact, updateContactArea) removed

  public static void main(String[] args) {
    new AddressBook();
  }
}
