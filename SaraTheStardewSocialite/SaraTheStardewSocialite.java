import java.awt.*;
import javax.swing.*;
import java.awt.event.InputEvent;

// The user should be positioned directly in front of a phone.
// Socialites NEED phones, okay?
public class SaraTheStardewSocialite {
    Robot sara;

    public static void main(String[] args) throws AWTException {
        // Main Method (Play Button)
        new SaraTheStardewSocialite();
    }

    public SaraTheStardewSocialite() throws AWTException {
        sara = new Robot();
        // Command Center Call
        commandCenter();
    }

    // The commands to be executed by Sara
    public void commandCenter() {
        String version = "Sara The Stardew Socialite";
        int calls;
        // Prompt user for number of calls
        calls = Integer.parseInt(JOptionPane.showInputDialog(null,
                "How many calls would you like to make?", version,
                JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Ready?",
                version, JOptionPane.INFORMATION_MESSAGE);

        // Wait 3 seconds to allow user time to change focus to Stardew Valley
        sara.delay(3000);

        for (int i = 1; i <= calls; i++) {
            // Move mouse directly over the phone
            sara.mouseMove(981, 468);
            sara.delay(300);
            // Right-click on phone
            rightClick();
            sara.delay(1000);
            // Move mouse to Clint's name one the list
            sara.mouseMove(469, 765);
            sara.delay(1000);
            // Left-click on Clint to call
            leftClick();
            // Wait for Clint to pick up and greet you
            sara.delay(7000);
            // Left-click to go to selection menu
            leftClick();
            sara.delay(1500);
            leftClick();
            // Move mouse to the Hang Up option
            sara.mouseMove(547, 997);
            sara.delay(1500);
            // Left-click to hang up
            leftClick();
        }

        // Ending Message
        JOptionPane.showMessageDialog(null, "Calling Complete!",
                version, JOptionPane.INFORMATION_MESSAGE);
    }

    // Method for left click and duration
    public void leftClick() {
        // Press left mouse button
        sara.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // Duration the mouse is pressed down
        sara.delay(60);
        // Release left mouse button
        sara.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    // Method for right click and duration
    public void rightClick() {
        // Press right mouse button
        sara.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        // Duration the mouse is pressed down
        sara.delay(60);
        // Release right mouse button
        sara.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }
}
