import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class GuiSandbox extends JFrame
        implements ActionListener, FocusListener {
    public static void main(String[] args) {
        new GuiSandbox();
    }

    // Create constructor
    public GuiSandbox() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(3, 3));
        setBounds(10, 10, 250, 200);
        setTitle("GUI Sandbox");

        for (int i = 0; i < 8; i++) {
            getContentPane().add(new JToggleButton("" + (char) ('A' + i)));
        }

        getContentPane().add(new JTextField(""));

        Component[] components = getContentPane().getComponents();

        for (int i = 0; i < components.length; i++) {
            // Downcast to register action listener
            if (components[i] instanceof JToggleButton) {
                ((JToggleButton) components[i]).addActionListener(this);
            } else if (components[i] instanceof JTextField) {
                ((JTextField) components[i]).addActionListener(this);
            }

            // Register focus listener on components
            components[i].addFocusListener(this);

            // Name each component to match buttons
            components[i].setName("" + (char) ('A' + i));
        }

        String lookAndFeel = "com.sun.java.swing.plaf.motif." + "MotifLookAndFeel";

        try {
            UIManager.setLookAndFeel(lookAndFeel);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // Apply look and feel
        SwingUtilities.updateComponentTreeUI(this);

        // Set frame visibility to true
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("ActionCommand = " + event.getActionCommand());
    }

    public void focusLost(FocusEvent event) {
        System.out.print(event.getComponent().getName() + " lost focus | ");
    }

    public void focusGained(FocusEvent event) {
        System.out.println(event.getComponent().getName() + " gained focus");
    }
}