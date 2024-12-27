import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class PotionSeller2 {
    Robot potionSeller;

    public static void main(String[] args) throws AWTException {
        // Main Method (Play Button)
        new PotionSeller2();
    }

    public PotionSeller2() throws AWTException {
        potionSeller = new Robot();
        int iterations;
        String version = "Potion Seller 2.0";

        // Initial Menu
        String[] menuStrings = {
                "                         Welcome to PotionSeller!\n",
                "\nThis auto-clicker executes around 1000 clicks per second        ",
                "\n                     How many clicks would you like?"
        };

        // Center mouse (4k resolution)
        potionSeller.mouseMove(1280, 720);

        // Set the number of clicks
        iterations = Integer.parseInt(JOptionPane.showInputDialog(null, menuStrings[0] +
                menuStrings[1] + menuStrings[2], version, JOptionPane.QUESTION_MESSAGE));

        String[] startStrings = {
                "            Total Clicks: " + iterations,
                "\n          Ready? On three...            "
        };
        JOptionPane.showMessageDialog(null, startStrings[0] +
                startStrings[1], version, JOptionPane.INFORMATION_MESSAGE);

        // Command Center Entrance
        potionSeller.delay(3000); // 3 second countdown
        for (int i = 0; i < iterations; i++) {
            commandCenter();
        }
        //   Command Center Exit

        JOptionPane.showMessageDialog(null, "Mischief Managed",
                version, JOptionPane.INFORMATION_MESSAGE);
    }

    public void commandCenter() {
        // 1 ms delay
        potionSeller.delay(1);
        // Press left mouse button
        potionSeller.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // Release left mouse button
        potionSeller.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
