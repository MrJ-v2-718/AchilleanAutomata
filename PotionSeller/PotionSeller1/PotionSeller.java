import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.time.LocalDateTime;
import java.util.Random;

public class PotionSeller {
    public static void main(String[] args) throws AWTException {
        Robot clicky = new Robot();
        Random randy = new Random();
        LocalDateTime startTime, endTime;
        int difference, iterations;

        // Set the number of clicks
        clicky.mouseMove(1280, 720);
        iterations = Integer.parseInt(JOptionPane.showInputDialog(null, "How many clicks?"));

        JOptionPane.showMessageDialog(null, "Ready?");
        clicky.delay(1000);

        startTime = LocalDateTime.now();
        int startMinute = startTime.getMinute();
        int startSeconds = startTime.getSecond();

        for (int i = 0; i < iterations; i++) {
            // Random delay
            int clickDelay = randy.nextInt(2, 5);
            // Press left mouse button
            clicky.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            // Release left mouse button
            clicky.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            // Implement delay
            clicky.delay(clickDelay);
        }

        endTime = LocalDateTime.now();
        int endMinute = endTime.getMinute();
        int endSeconds = endTime.getSecond();
        if (startMinute == endMinute) {
            difference = endSeconds - startSeconds;
        } else {
            difference = ((endMinute - startMinute) * 60) + (endSeconds - startSeconds);
        }


        JOptionPane.showMessageDialog(null,
                iterations + " clicks in " + difference + " seconds");
    }
}