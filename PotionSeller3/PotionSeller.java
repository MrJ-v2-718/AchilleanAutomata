import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class PotionSeller {
    Robot potionSeller;

    public static void main(String[] args) throws AWTException {
        // Main Method
        new PotionSeller();
    }

    public PotionSeller() throws AWTException {
        potionSeller = new Robot();
        int iterations;
        String input;
        boolean programContinue = true;

        while (programContinue) {
            try {
                // Prompt user for number of clicks
                input = JOptionPane.showInputDialog(null,
                        "                           Welcome to PotionSeller!\n" +
                                "\n This auto-clicker executes around 1000 clicks per second.        " +
                                "\nTo prevent foolishness, clicks are limited to 30,000. (~30s)        " +
                                "\n                     How many clicks would you like?\n\n", "Potion Seller",
                        JOptionPane.QUESTION_MESSAGE);

                // Handle cancellation or null input (e.g., if the user closes the dialog)
                if (input == null) {
                    programContinue = false;
                    System.exit(0);
                }

                // Try to parse the input to an integer to set the number of clicks
                iterations = Integer.parseInt(input);

                if (iterations > 0 && iterations <= 30000) {
                    JOptionPane.showMessageDialog(null,
                            "            Total Clicks: " + iterations +
                                    "\n          Ready? On three...            ", "Potion Seller",
                            JOptionPane.INFORMATION_MESSAGE);

                    // 3-second countdown
                    potionSeller.delay(3000);

                    // Execute clicks
                    for (int i = 0; i < iterations; i++) {
                        commandCenter();
                    }

                    JOptionPane.showMessageDialog(null, "    Clicks Complete",
                            "Potion Seller", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "  Invalid Click Amount", "Potion Seller",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException e) {
                // Handle non-numeric input
                JOptionPane.showMessageDialog(null,
                        "        Invalid Input", "Potion Seller",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
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
