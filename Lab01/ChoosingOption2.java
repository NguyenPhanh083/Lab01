import javax.swing.JOptionPane;

public class ChoosingOption2 {
    public static void main(String[] args) {
        // Customize the options
        String[] options = {"Yes", "No"}; 

        // Show the confirmation dialog 
        int option = JOptionPane.showOptionDialog(null, 
                "Do you want to change to first class ticket?", 
                "Confirmation", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]); 

        // Process the user's choice
        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: Yes");
        } else {
            JOptionPane.showMessageDialog(null, "You've chosen: No");
        }

        System.exit(0);
    }
}
