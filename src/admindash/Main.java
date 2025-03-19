package admindash;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame to hold the userbutton panel
        JFrame frame = new JFrame("User Button Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        
        // Add userbutton panel to the frame
        frame.add(new userbutton());
        
        // Make it visible
        frame.setVisible(true);
    }
}
