import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class PlayerOne {
    Random randy = new Random();
    Robot robecca;
    int typeDelay;
    GuiSandbox sandy = new GuiSandbox();
    // Here's an array of some keyboard input
    int[] keyInput = {
            KeyEvent.VK_A,                 // Index 0
            KeyEvent.VK_B,                 // Index 1
            KeyEvent.VK_C,                 // Index 2
            KeyEvent.VK_D,                 // Index 3
            KeyEvent.VK_E,                 // Index 4
            KeyEvent.VK_F,                 // Index 5
            KeyEvent.VK_G,                 // Index 6
            KeyEvent.VK_H,                 // Index 7
            KeyEvent.VK_I,                 // Index 8
            KeyEvent.VK_J,                 // Index 9
            KeyEvent.VK_K,                 // Index 10
            KeyEvent.VK_L,                 // Index 11
            KeyEvent.VK_M,                 // Index 12
            KeyEvent.VK_N,                 // Index 13
            KeyEvent.VK_O,                 // Index 14
            KeyEvent.VK_P,                 // Index 15
            KeyEvent.VK_Q,                 // Index 16
            KeyEvent.VK_R,                 // Index 17
            KeyEvent.VK_S,                 // Index 18
            KeyEvent.VK_T,                 // Index 19
            KeyEvent.VK_U,                 // Index 20
            KeyEvent.VK_V,                 // Index 21
            KeyEvent.VK_W,                 // Index 22
            KeyEvent.VK_X,                 // Index 23
            KeyEvent.VK_Y,                 // Index 24
            KeyEvent.VK_Z,                 // Index 25
            KeyEvent.VK_0,                 // Index 26
            KeyEvent.VK_1,                 // Index 27
            KeyEvent.VK_2,                 // Index 28
            KeyEvent.VK_3,                 // Index 29
            KeyEvent.VK_4,                 // Index 30
            KeyEvent.VK_5,                 // Index 31
            KeyEvent.VK_6,                 // Index 32
            KeyEvent.VK_7,                 // Index 33
            KeyEvent.VK_8,                 // Index 34
            KeyEvent.VK_9,                 // Index 35
            KeyEvent.VK_PERIOD,            // Index 36
            KeyEvent.VK_EXCLAMATION_MARK,  // Index 37
            KeyEvent.VK_SPACE,             // Index 38
            KeyEvent.VK_BACK_SPACE,        // Index 39
            KeyEvent.VK_SHIFT,             // Index 40
            KeyEvent.VK_TAB,               // Index 41
            KeyEvent.VK_ENTER,             // Index 42
            KeyEvent.VK_LEFT_PARENTHESIS,  // Index 43
            KeyEvent.VK_RIGHT_PARENTHESIS, // Index 44
            KeyEvent.VK_BACK_SLASH,        // Index 45
            KeyEvent.VK_UNDERSCORE,        // Index 46
            KeyEvent.VK_QUOTE,             // Index 47
            KeyEvent.VK_QUOTEDBL,          // Index 48
            KeyEvent.VK_SEMICOLON,         // Index 49
            KeyEvent.VK_COLON,             // Index 50
            KeyEvent.VK_COMMA,             // Index 51
            KeyEvent.VK_ADD,               // Index 52
            KeyEvent.VK_SUBTRACT,          // Index 53
            KeyEvent.VK_EQUALS,            // Index 54
            KeyEvent.VK_HOME,              // Index 55
            KeyEvent.VK_END,               // Index 56
            KeyEvent.VK_PRINTSCREEN,       // Index 57
            KeyEvent.VK_PAGE_UP,           // Index 58
            KeyEvent.VK_PAGE_DOWN,         // Index 59
            KeyEvent.VK_F1,                // Index 60
            KeyEvent.VK_F2,                // Index 61
            KeyEvent.VK_F3,                // Index 62
            KeyEvent.VK_F4,                // Index 63
            KeyEvent.VK_F5,                // Index 64
            KeyEvent.VK_F6,                // Index 65
            KeyEvent.VK_F7,                // Index 66
            KeyEvent.VK_F8,                // Index 67
            KeyEvent.VK_F9,                // Index 68
            KeyEvent.VK_F10,               // Index 69
            KeyEvent.VK_F11,               // Index 70
            KeyEvent.VK_F12,               // Index 71
            KeyEvent.VK_NUMBER_SIGN,       // Index 72
            KeyEvent.VK_AT,                // Index 73
            KeyEvent.VK_DOLLAR,            // Index 74
            KeyEvent.VK_OPEN_BRACKET,      // Index 75
            KeyEvent.VK_CLOSE_BRACKET,     // Index 76
            KeyEvent.VK_CIRCUMFLEX,        // Index 77
            KeyEvent.VK_SLASH              // Index 78
    };

    public static void main(String[] args) {
        System.out.println("Ready player one.");
        new PlayerOne();
        System.out.println("End of program.");
    }

    // Create a constructor
    public PlayerOne() {
        try {
            robecca = new Robot();
        } catch (AWTException exception) {
            exception.printStackTrace();
        }

        while (!(sandy.isShowing())) {
            // Loop until Sandbox is showing on screen
        }

        Component[] components = sandy.getContentPane().getComponents();

        // Robecca traverses in the forward direction using the tab key
        System.out.println("Robecca marches on.");
        for (int i = 0; i < (components.length - 1); i++) {
            robecca.keyPress(keyInput[41]); // Tab
            robecca.keyRelease(keyInput[41]);
            // Prints loop #
            System.out.println("Robecca iteration #" + i);
            // Delay so you can watch focus changes
            robecca.delay(1200);
        }

        // Robecca has something to say
        upperCase(8); // I
        lowerCase(38); // space
        lowerCase(0); // a
        lowerCase(12); // m
        lowerCase(38); // space
        lowerCase(0); // a
        lowerCase(11); // l
        lowerCase(8); // i
        lowerCase(21); // v
        lowerCase(4); // e
        upperCase(37); // !

    }

    public void lowerCase(int input) {
        // Lower case and special characters with variant delay
        typeDelay = randy.nextInt(50, 100);
        robecca.delay(typeDelay);
        robecca.keyPress(keyInput[input]);
        robecca.keyRelease(keyInput[input]);
    }

    public void upperCase(int input) {
        // Upper case and special characters with variant delay
        typeDelay = randy.nextInt(50, 100);
        robecca.delay(typeDelay);
        robecca.keyPress(keyInput[40]); // press shift
        robecca.keyPress(keyInput[input]);
        robecca.keyRelease(keyInput[input]);
        robecca.keyRelease(keyInput[40]); // release shift
    }
}