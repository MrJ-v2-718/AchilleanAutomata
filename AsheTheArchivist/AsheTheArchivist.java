import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class AsheTheArchivist {
    Robot ashe;
    // An array of keyboard input
    int[] keyInput = {
            KeyEvent.VK_0,               // Index 0
            KeyEvent.VK_1,               // Index 1
            KeyEvent.VK_2,               // Index 2
            KeyEvent.VK_3,               // Index 3
            KeyEvent.VK_4,               // Index 4
            KeyEvent.VK_5,               // Index 5
            KeyEvent.VK_6,               // Index 6
            KeyEvent.VK_7,               // Index 7
            KeyEvent.VK_8,               // Index 8
            KeyEvent.VK_9,               // Index 9
            KeyEvent.VK_MINUS,           // Index 10
            KeyEvent.VK_PERIOD,          // Index 11
            KeyEvent.VK_M,               // Index 12
            KeyEvent.VK_P,               // Index 13
            KeyEvent.VK_TAB              // Index 14
    };

    public static void main(String[] args) throws AWTException {
        // Main Method (Play Button)
        new AsheTheArchivist();
    }

    public AsheTheArchivist() throws AWTException {
        ashe = new Robot();
        // Command Center Call
        commandCenter();
    }

    // The commands to be executed by Ashe
    public void commandCenter() {
        String version = "Ashe The Archivist";
        int start, stop;
        // Prompt user for starting video number
        start = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter starting video number:", version,
                JOptionPane.QUESTION_MESSAGE));
        // Prompt user for ending video number
        stop = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter ending video number:", version,
                JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Ready?",
                version, JOptionPane.INFORMATION_MESSAGE);

        // Wait 3 seconds to allow user time to change focus to HandBrake
        ashe.delay(3000);
        // Move mouse to Queue button
        ashe.mouseMove(79, 73);
        // Wait 1/10 of a second
        ashe.delay(100);
        // Left click once for 10ms
        leftClick();
        // Wait 1/10 of a second
        ashe.delay(100);
        // Move mouse to Add Multiple button
        ashe.mouseMove(79, 123);
        // Wait 1/10 of a second
        ashe.delay(100);
        // Left click once for 10ms
        leftClick();
        // Wait 2 seconds for title box window to open
        ashe.delay(2000);
        // Move mouse to first title box
        ashe.mouseMove(888, 355);
        // Wait 1/10 of a second
        ashe.delay(100);
        // Left click 3 times to highlight title
        leftClick();
        ashe.delay(10);
        leftClick();
        ashe.delay(10);
        leftClick();
        ashe.delay(10);
        for (int i = start; i <= stop; i++) {
            titleFill(i);
        }
    }

    // Method for single key press
    public void keyboard(int index) {
        // Key Press
        ashe.keyPress(keyInput[index]);
        // Duration the key is held down
        ashe.delay(10);
        // Key Release
        ashe.keyRelease(keyInput[index]);
    }

    // Method for left click and duration
    public void leftClick() {
        // Press left mouse button
        ashe.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // Duration the mouse is pressed down
        ashe.delay(10);
        // Release left mouse button
        ashe.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    // Fill titles for five video segments
    public void titleFill(int videoNumber) {
        if (videoNumber >= 10) {
            String digits = String.valueOf(videoNumber);
            char firstDigit = digits.charAt(0);
            char secondDigit = digits.charAt(1);
            int first = Integer.parseInt(String.valueOf(firstDigit));
            int second = Integer.parseInt(String.valueOf(secondDigit));
            for (int i = 1; i <= 5; i++) {
                // Type "videoNumber"-"i".mp4
                keyboard(first);
                ashe.delay(10);
                keyboard(second);
                ashe.delay(10);
                keyboard(10);
                ashe.delay(10);
                keyboard(i);
                ashe.delay(10);
                keyboard(11);
                ashe.delay(10);
                keyboard(12);
                ashe.delay(10);
                keyboard(13);
                ashe.delay(10);
                keyboard(4);
                ashe.delay(10);
                // Press tab four times to switch to next title box
                keyboard(14);
                ashe.delay(10);
                keyboard(14);
                ashe.delay(10);
                keyboard(14);
                ashe.delay(10);
                keyboard(14);
                ashe.delay(10);
            }
        } else {
            for (int i = 1; i <= 5; i++) {
                // Type "videoNumber"-"i".mp4
                keyboard(videoNumber);
                ashe.delay(10);
                keyboard(10);
                ashe.delay(10);
                keyboard(i);
                ashe.delay(10);
                keyboard(11);
                ashe.delay(10);
                keyboard(12);
                ashe.delay(10);
                keyboard(13);
                ashe.delay(10);
                keyboard(4);
                ashe.delay(10);
                // Press tab four times to switch to next title box
                keyboard(14);
                ashe.delay(10);
                keyboard(14);
                ashe.delay(10);
                keyboard(14);
                ashe.delay(10);
                keyboard(14);
                ashe.delay(10);
            }
        }
    }
}
