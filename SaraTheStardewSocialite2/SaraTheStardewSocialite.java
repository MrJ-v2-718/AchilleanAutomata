import java.awt.*;
import javax.swing.*;
import java.awt.event.InputEvent;
import java.util.Objects;

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

        JOptionPane.showMessageDialog(null, "Ready?",
                version, JOptionPane.INFORMATION_MESSAGE);

        // Wait 3 seconds to allow user time to change focus to Stardew Valley
        sara.delay(3000);

        // This pixel pattern indicates it is 9am
        Color isNineAm = new Color(149, 97, 65);
        Color isNineAm2 = new Color(162, 124, 83);
        Color isNineAm3 = new Color(161, 106, 68);

        boolean nineAm = false;
        while (!nineAm) {
            // Checking pixel pattern in time area five times per second
            Color isItNineAm = sara.getPixelColor(1758, 121);
            Color isItNineAm2 = sara.getPixelColor(1758, 132);
            Color isItNineAm3 = sara.getPixelColor(1830, 136);

            if (Objects.equals(isItNineAm, isNineAm)) {
                if (Objects.equals(isItNineAm2, isNineAm2)) {
                    if (Objects.equals(isItNineAm3, isNineAm3)) {
                        nineAm = true;
                    }
                }
            }
            sara.delay(200);
        }

        // This pixel pattern indicates it is 4pm
        Color isFourPm = new Color(242, 182, 110);
        Color isFourPm2 = new Color(242, 191, 114);
        Color isFourPm3 = new Color(46, 26, 37);

        boolean fourPm = false;
        while (!fourPm) {
            // Checking pixel pattern in time area at start of loop
            Color isItFourPm = sara.getPixelColor(1758, 121);
            Color isItFourPm2 = sara.getPixelColor(1758, 132);
            Color isItFourPm3 = sara.getPixelColor(1830, 136);

            if (Objects.equals(isItFourPm, isFourPm)) {
                if (Objects.equals(isItFourPm2, isFourPm2)) {
                    if (Objects.equals(isItFourPm3, isFourPm3)) {
                        // If it is four pm, stop calling
                        fourPm = true;
                    }
                }
            }
            // Move mouse directly over the phone
            sara.mouseMove(981, 468);
            sara.delay(1000);
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