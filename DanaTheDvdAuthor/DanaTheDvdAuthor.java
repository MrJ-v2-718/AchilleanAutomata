import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class DanaTheDvdAuthor {
    Robot dana;
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
    };

    public static void main(String[] args) throws AWTException {
        // Main Method (Play Button)
        new DanaTheDvdAuthor();
    }

    public DanaTheDvdAuthor() throws AWTException {
        dana = new Robot();
        // Command Center Call
        commandCenter();
    }

    // The commands to be executed by Ashe
    public void commandCenter() {
        String version = "Dana The DVD Author";

        JOptionPane.showMessageDialog(null, "Ready?",
                version, JOptionPane.INFORMATION_MESSAGE);

        // Wait 3 seconds to allow user time to change focus to Devede
        dana.delay(3000);
        // Move mouse to Edit button
        dana.mouseMove(57, 78);
        dana.delay(10);
        // Left click Edit button
        leftClick();
        dana.delay(10);
        // Move mouse to Set multiproperties button
        dana.mouseMove(60, 95);
        dana.delay(10);
        // Left click Set multiproperties button
        leftClick();
        dana.delay(100);

        // Move mouse to Select all button
        dana.mouseMove(1290, 265);
        dana.delay(10);
        // Left click Select all button
        leftClick();
        dana.delay(10);
        // Move mouse to Automatic checkbox for Video Rate
        dana.mouseMove(655, 612);
        dana.delay(10);
        // Left click to uncheck Automatic checkbox for Video Rate
        leftClick();
        dana.delay(10);
        // Move mouse to the input box for Video Rate
        dana.mouseMove(796, 612);
        dana.delay(10);
        // Double left click to select Video rate
        leftClick();
        dana.delay(10);
        leftClick();
        dana.delay(10);
        // Enter 8500 for max Video rate
        keyboard(8);
        dana.delay(10);
        keyboard(5);
        dana.delay(10);
        keyboard(0);
        dana.delay(10);
        keyboard(0);
        dana.delay(10);
        // Move mouse to Automatic checkbox for Audio Rate
        dana.mouseMove(1017, 612);
        dana.delay(10);
        // Left click to uncheck Automatic checkbox for Audio Rate
        leftClick();
        dana.delay(10);
        // Move mouse to the input box for Audio Rate
        dana.mouseMove(1160, 612);
        // Double left click to select Audio rate
        leftClick();
        dana.delay(10);
        leftClick();
        dana.delay(10);
        // Enter 448 for max Audio rate
        keyboard(4);
        dana.delay(10);
        keyboard(4);
        dana.delay(10);
        keyboard(8);
        dana.delay(10);

        // Move mouse to Video Options
        dana.mouseMove(870, 469);
        dana.delay(10);
        // Left click Video Options tab
        leftClick();
        dana.delay(10);
        // Move mouse to 16:9 radio button under Aspect ratio
        dana.mouseMove(654, 642);
        dana.delay(10);
        // Left click 16:9 radio button
        leftClick();
        dana.delay(10);
        // Move mouse to 720x480 radio button under Final size
        dana.mouseMove(654, 537);
        dana.delay(10);
        // Left click 720x480 radio button
        leftClick();
        dana.delay(10);
        // Move mouse to scale picture radio button under Scaling mode
        dana.mouseMove(1083, 576);
        dana.delay(10);
        // Left click scale picture radio button
        leftClick();
        dana.delay(10);

        // Move mouse to Quality
        dana.mouseMove(979, 469);
        dana.delay(10);
        // Left click Quality tab
        leftClick();
        dana.delay(10);
        // Move mouse to Use dual pass encoding checkbox
        dana.mouseMove(652, 516);
        dana.delay(10);
        // Left click to check Use dual pass encoding checkbox
        leftClick();
        dana.delay(10);

        // Move mouse to Actions
        dana.mouseMove(1129, 469);
        dana.delay(10);
        // Left click Actions tab
        leftClick();
        dana.delay(10);
        // Move mouse to Play the next title radio button
        dana.mouseMove(654, 603);
        dana.delay(10);
        // Left click Play the next title radio button
        leftClick();
        dana.delay(10);

        // Move mouse to Apply
        dana.mouseMove(1311, 870);
        dana.delay(10);
        // Left click Apply button
        leftClick();
    }

    // Method for single key press
    public void keyboard(int index) {
        // Key Press
        dana.keyPress(keyInput[index]);
        // Duration the key is held down
        dana.delay(10);
        // Key Release
        dana.keyRelease(keyInput[index]);
    }

    // Method for left click
    public void leftClick() {
        // Press left mouse button
        dana.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // Duration the mouse is pressed down
        dana.delay(10);
        // Release left mouse button
        dana.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}