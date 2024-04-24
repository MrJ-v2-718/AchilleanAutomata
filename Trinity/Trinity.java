import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Trinity {
    // A showcase of the Robot class in Java
    public static void main(String[] args) throws AWTException {
        // First, I create a robot named trinity
        Robot trinity = new Robot();
        // Move mouse to location of text editor icon
        trinity.mouseMove(444, 867);
        // Wait a second
        trinity.delay(1000);
        // Press left mouse button
        trinity.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // Release left mouse button
        trinity.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        // Wait 2 seconds
        trinity.delay(2000);
        // Press and hold shift
        trinity.keyPress(KeyEvent.VK_SHIFT);
        // Press w
        trinity.keyPress(KeyEvent.VK_W);
        // Release shift
        trinity.keyRelease(KeyEvent.VK_SHIFT);
        // Release w
        trinity.keyRelease(KeyEvent.VK_W);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press a
        trinity.keyPress(KeyEvent.VK_A);
        // Release a
        trinity.keyRelease(KeyEvent.VK_A);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press k
        trinity.keyPress(KeyEvent.VK_K);
        // Release k
        trinity.keyRelease(KeyEvent.VK_K);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press e
        trinity.keyPress(KeyEvent.VK_E);
        // Release e
        trinity.keyRelease(KeyEvent.VK_E);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press space
        trinity.keyPress(KeyEvent.VK_SPACE);
        // Release space
        trinity.keyRelease(KeyEvent.VK_SPACE);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press u
        trinity.keyPress(KeyEvent.VK_U);
        // Release u
        trinity.keyRelease(KeyEvent.VK_U);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press p
        trinity.keyPress(KeyEvent.VK_P);
        // Release p
        trinity.keyRelease(KeyEvent.VK_P);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press ,
        trinity.keyPress(KeyEvent.VK_COMMA);
        // Release ,
        trinity.keyRelease(KeyEvent.VK_COMMA);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press space
        trinity.keyPress(KeyEvent.VK_SPACE);
        // Release space
        trinity.keyRelease(KeyEvent.VK_SPACE);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press and hold shift
        trinity.keyPress(KeyEvent.VK_SHIFT);
        // Press n
        trinity.keyPress(KeyEvent.VK_N);
        // Release shift
        trinity.keyRelease(KeyEvent.VK_SHIFT);
        // Release n
        trinity.keyRelease(KeyEvent.VK_N);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press e
        trinity.keyPress(KeyEvent.VK_E);
        // Release e
        trinity.keyRelease(KeyEvent.VK_E);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press o
        trinity.keyPress(KeyEvent.VK_O);
        // Release o
        trinity.keyRelease(KeyEvent.VK_O);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press .
        trinity.keyPress(KeyEvent.VK_PERIOD);
        // Release .
        trinity.keyRelease(KeyEvent.VK_PERIOD);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press .
        trinity.keyPress(KeyEvent.VK_PERIOD);
        // Release .
        trinity.keyRelease(KeyEvent.VK_PERIOD);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press .
        trinity.keyPress(KeyEvent.VK_PERIOD);
        // Release .
        trinity.keyRelease(KeyEvent.VK_PERIOD);
        // Wait 1/10 of a second
        trinity.delay(100);
        // Press .
        trinity.keyPress(KeyEvent.VK_PERIOD);
        // Release .
        trinity.keyRelease(KeyEvent.VK_PERIOD);

    }
}