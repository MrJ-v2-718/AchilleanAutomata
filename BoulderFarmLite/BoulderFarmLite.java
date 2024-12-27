import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class BoulderFarmLite {
    Robot foulTarnished;
    // An array of keyboard input used in Elden Ring
    int[] keyInput = {
            KeyEvent.VK_W,                 // Index 0
            KeyEvent.VK_A,                 // Index 1
            KeyEvent.VK_S,                 // Index 2
            KeyEvent.VK_D,                 // Index 3
            KeyEvent.VK_E,                 // Index 4
            KeyEvent.VK_F,                 // Index 5
            KeyEvent.VK_G,                 // Index 6
            KeyEvent.VK_Q,                 // Index 7
            KeyEvent.VK_R,                 // Index 8
            KeyEvent.VK_X,                 // Index 9
            KeyEvent.VK_SPACE,             // Index 10
            KeyEvent.VK_SHIFT,             // Index 11
            KeyEvent.VK_ALT,               // Index 12
            KeyEvent.VK_ESCAPE,            // Index 13
            KeyEvent.VK_UP,                // Index 14
            KeyEvent.VK_DOWN,              // Index 15
            KeyEvent.VK_LEFT,              // Index 16
            KeyEvent.VK_RIGHT              // Index 17
    };

    public static void main(String[] args) throws AWTException {
        new BoulderFarmLite();
    }

    public BoulderFarmLite() throws AWTException {
        foulTarnished = new Robot();

        // Initial Menu
        String[] menuStrings = {
                "                   Welcome to BoulderFarm!",
                "\nEach lap takes 37.2 seconds and earns 1952 runes        ",
                "\n    Laps earn 2342 runes with the Golden Scarab",
                "\n           How many laps would you like to run?"
        };

        int iterations = Integer.parseInt(JOptionPane.showInputDialog(menuStrings[0] + menuStrings[1] +
                menuStrings[2] + menuStrings[3]));

        // Start Message
        String[] startStrings = {
                "        Total Laps: " + iterations,
                "\n    Ready? On three...    "
        };
        JOptionPane.showMessageDialog(null, startStrings[0] +
                startStrings[1]);

        // Command Center Entrance
        foulTarnished.delay(3000); // 3 second countdown
        for (int i = 0; i < iterations; i++) {
            keyboard(0, 1, 6350); // press w + a to run in a circle,
            foulTarnished.delay(200); // because I don't feel like messing with mouse controls
            keyboard(1, 1000); // press a to run left
            foulTarnished.delay(200);
            keyboard(8, 100); // press r to mount Torrent
            keyboard(0, 10, 3500); // press w + space to dash forward
            keyboard(0, 3, 750); // press w + d to align with trail
            keyboard(0, 10, 7100); // press w + space to dash forward until boulder spawns
            keyboard(0, 3, 1350); // press w + d to cut right and avoid boulder
            keyboard(3, 10, 1000); // press d + space to dash out of harms way
            foulTarnished.delay(5000); // wait for boulder to perish, muahahaha
            keyboard(6, 100); // press g to pull up map
            foulTarnished.delay(500);
            keyboard(2, 3, 250); // press d + s to travel southeast
            keyboard(3, 285); // press d to travel east
            foulTarnished.delay(100);
            keyboard(1, 20); // press a to adjust and highlight site of grace
            foulTarnished.delay(100);
            keyboard(4, 100); // press e to select site of grace
            foulTarnished.delay(200);
            keyboard(4, 100); // press e to confirm
            foulTarnished.delay(9000); // loading time (9 seconds)
        }
        //   Command Center Exit
        JOptionPane.showMessageDialog(null, "    Farming Complete!        ");
    }

    // Method for single keypress and duration
    public void keyboard(int index, int duration) {
        // Lower case and special characters
        foulTarnished.keyPress(keyInput[index]);
        // Duration the key is held down
        foulTarnished.delay(duration);
        foulTarnished.keyRelease(keyInput[index]);
    }

    // Overloaded method to allow multiple key presses
    public void keyboard(int index, int index2, int duration) {
        // Lower case and special characters
        foulTarnished.keyPress(keyInput[index]);
        foulTarnished.keyPress(keyInput[index2]);
        // Duration the key is held down
        foulTarnished.delay(duration);
        foulTarnished.keyRelease(keyInput[index]);
        foulTarnished.keyRelease(keyInput[index2]);
    }
}
