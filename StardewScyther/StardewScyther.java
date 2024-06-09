import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class StardewScyther {
    public static void main(String[] args) throws AWTException {
        Robot scyther = new Robot();

        JOptionPane.showMessageDialog(null, "Ready?");
        // Wait 3 seconds
        scyther.delay(3000);

        while (1 == 1) {
            // Press left mouse button
            scyther.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            scyther.delay(60);
            // Release left mouse button
            scyther.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            // Implement delay
            scyther.delay(100);
        }
    }
}