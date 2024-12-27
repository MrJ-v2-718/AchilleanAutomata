import java.awt.*;
import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class SaraStardew {
    Robot sara;
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
            KeyEvent.VK_OPEN_BRACKET,    // Index 10
            KeyEvent.VK_CLOSE_BRACKET,   // Index 11
            KeyEvent.VK_ENTER,           // Index 12
            KeyEvent.VK_TAB,             // Index 13
            KeyEvent.VK_BACK_SPACE       // Index 14
    };

    public static void main(String[] args) throws AWTException {
        // Main Method
        new SaraStardew();
    }

    public SaraStardew() throws AWTException {
        sara = new Robot();
        // Command Center Call
        commandCenter();
    }

    // The commands to be executed by Sara
    public void commandCenter() {
        /*
        This program is made for a 1920x1080 screen resolution.
        The UI is set to 90% and Zoom is set to 75%.
        */
        String menu = """
                *******************************************************
                 Sara Stardew is a robot assistant for Stardew Valley.
                -------------------------------------------------------
                This program is made for a 1920x1080 screen resolution.
                     The UI is set to 90% and Zoom is set to 75%.
                     Refer to README for additional instructions.
                *******************************************************
                
                         Please Select From The Following Menu
                      -------------------------------------------
                      1 Make A Fixed Amount Of Calls
                      2 Auto Calling From 9am to 10:10pm
                      3 Purchase Chickens With Item Code Names
                      4 Scythe, Chop, Battle Mode (Auto Clicker)
                     -1 Exit The Program
                
                """;
        String input, callMenu, itemMenu;
        int SENTINEL = -1;
        Font monospacedFont = new Font("Monospaced", Font.PLAIN, 12);
        JLabel message = new JLabel();
        message.setFont(monospacedFont);
        int menuChoice, callMenuChoice, itemMenuChoice1, itemMenuChoice2, itemMenuChoice3, choiceNumber;
        boolean programContinue = true;

        while (programContinue) {
            try {
                // Prompt user for menu choice
                message = new JLabel("<html><pre>" + menu + "</pre></html>");
                input = JOptionPane.showInputDialog(null,
                        message, "Sara Stardew",
                        JOptionPane.QUESTION_MESSAGE);

                // Handle cancellation or null input (e.g., if the user closes the dialog)
                if (input == null) {
                    System.exit(0);  // Or break out of the loop if you prefer
                }

                // Try to parse the input to an integer
                menuChoice = Integer.parseInt(input);

                if (menuChoice == SENTINEL) {
                    break;
                }

                // Check if the choice is valid
                if (menuChoice >= 1 && menuChoice <= 5) {
                    switch (menuChoice) {
                        case 1:
                            // Make A Fixed Amount Of Calls
                            try {
                                // The user should be positioned directly in front of a phone.
                                // Ensure you have the scythe equipped so you don't uproot the phone.
                                callMenu = """
                                        ******************************************************************
                                            The user should be positioned directly in front of a phone.
                                        Ensure you have the scythe equipped so you don't uproot the phone.
                                        ******************************************************************
                                            (Clint) Smithy Hours of Operation:
                                            ----------------------------------
                                                SUN 9am to 4pm
                                                MON 9am to 4pm
                                                TUE 9am to 4pm
                                                WED 9am to 4pm
                                                THU 9am to 4pm
                                                FRI Closed (After Community Center is Restored)
                                                SAT 9am to 4pm
                                        
                                            (Pierre) General Store Hours of Operation:
                                            ------------------------------------------
                                                SUN 9am to 5pm
                                                MON 9am to 5pm
                                                TUE 9am to 5pm
                                                WED Closed (9am to 5pm After Bundles Are Completed)
                                                THU 9am to 5pm
                                                FRI 9am to 5pm
                                                SAT 9am to 5pm
                                        
                                            (Gus) Saloon Hours of Operation:
                                            --------------------------------
                                                SUN 12pm to 12am
                                                MON 12pm to 12am
                                                TUE 12pm to 12am
                                                WED 12pm to 12am
                                                THU 12pm to 12am
                                                FRI 12pm to 12am
                                                SAT 12pm to 12am
                                        ******************************************************************
                                        
                                           Please Select From The Following Menu
                                        -------------------------------------------
                                            1 Call Clint
                                            2 Call Pierre
                                            3 Call Gus
                                           -1 Exit Call Menu
                                        
                                        """;

                                // Prompt user for call menu choice
                                message = new JLabel("<html><pre>" + callMenu + "</pre></html>");
                                input = JOptionPane.showInputDialog(null,
                                        message, "Call Menu",
                                        JOptionPane.QUESTION_MESSAGE);

                                // Handle cancellation or null input (e.g., if the user closes the dialog)
                                if (input == null) {
                                    break;
                                }

                                // Try to parse the input to an integer
                                callMenuChoice = Integer.parseInt(input);

                                if (callMenuChoice == SENTINEL) {
                                    break;
                                }

                                if (callMenuChoice >= 1 && callMenuChoice <= 4) {
                                    switch (callMenuChoice) {
                                        case 1:
                                            // Call Clint
                                            callFixed(1);
                                            break;
                                        case 2:
                                            // Call Pierre
                                            callFixed(2);
                                            break;
                                        case 3:
                                            // Call Gus
                                            callFixed(3);
                                        case 4:
                                            // Exit The Call Menu
                                            continue;
                                        default:
                                            break;
                                    }
                                } else {
                                    message = new JLabel("<html><pre>" + "Invalid Menu Selection" + "</pre></html>");
                                    JOptionPane.showMessageDialog(null,
                                            message, "Call Menu",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }
                            } catch (NumberFormatException e) {
                                // Handle non-numeric input
                                message = new JLabel("<html><pre>" + "Invalid Input" + "</pre></html>");
                                JOptionPane.showMessageDialog(null,
                                        message, "Call Menu",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        case 2:
                            // Auto Calling From 9am to 10:10pm
                            // The user should be positioned directly in front of a phone.
                            // Ensure you have the scythe equipped so you don't uproot the phone.
                            try {
                                callMenu = """
                                        ******************************************************************
                                            The user should be positioned directly in front of a phone.
                                        Ensure you have the scythe equipped so you don't uproot the phone.
                                          If Clint is currently upgrading one of your tools, he will not
                                           say your name. Also, if either shop is closed, they will not
                                           answer the phone. Confirm which character you'd like to call
                                          before using this utility. Also, ensure Gus will be open later.
                                        ******************************************************************
                                            (Clint) Smithy Hours of Operation:
                                            ----------------------------------
                                                SUN 9am to 4pm
                                                MON 9am to 4pm
                                                TUE 9am to 4pm
                                                WED 9am to 4pm
                                                THU 9am to 4pm
                                                FRI Closed (After Community Center is Restored)
                                                SAT 9am to 4pm
                                        
                                            (Pierre) General Store Hours of Operation:
                                            ------------------------------------------
                                                SUN 9am to 5pm
                                                MON 9am to 5pm
                                                TUE 9am to 5pm
                                                WED Closed (9am to 5pm After Bundles Are Completed)
                                                THU 9am to 5pm
                                                FRI 9am to 5pm
                                                SAT 9am to 5pm
                                        
                                            (Gus) Saloon Hours of Operation:
                                            --------------------------------
                                                SUN 12pm to 12am
                                                MON 12pm to 12am
                                                TUE 12pm to 12am
                                                WED 12pm to 12am
                                                THU 12pm to 12am
                                                FRI 12pm to 12am
                                                SAT 12pm to 12am
                                        ******************************************************************
                                        
                                        
                                           Please Select From The Following Menu
                                        -------------------------------------------
                                            1 Call Clint then Gus
                                            2 Call Pierre then Gus
                                           -1 Exit Call Menu
                                        
                                        """;

                                // Prompt user for call menu choice
                                message = new JLabel("<html><pre>" + callMenu + "</pre></html>");
                                input = JOptionPane.showInputDialog(null,
                                        message, "Call Menu",
                                        JOptionPane.QUESTION_MESSAGE);

                                // Handle cancellation or null input (e.g., if the user closes the dialog)
                                if (input == null) {
                                    break;
                                }

                                // Try to parse the input to an integer
                                callMenuChoice = Integer.parseInt(input);

                                if (callMenuChoice == SENTINEL) {
                                    break;
                                }

                                if (callMenuChoice >= 1 && callMenuChoice <= 3) {
                                    switch (callMenuChoice) {
                                        case 1:
                                            // Call Clint then Gus
                                            callAuto(1);
                                            break;
                                        case 2:
                                            // Call Pierre then Gus
                                            callAuto(2);
                                            break;
                                        case 3:
                                            // Exit The Call Menu
                                            continue;
                                        default:
                                            break;
                                    }
                                } else {
                                    message = new JLabel("<html><pre>" + "Invalid Menu Selection" + "</pre></html>");
                                    JOptionPane.showMessageDialog(null,
                                            message, "Call Menu",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }
                            } catch (NumberFormatException e) {
                                // Handle non-numeric input
                                message = new JLabel("<html><pre>" + "Invalid Input" + "</pre></html>");
                                JOptionPane.showMessageDialog(null,
                                        message, "Call Menu",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        case 3:
                            // Purchase Animals With Item Code Names
                            try {
                                choiceNumber = 1;
                                itemMenu = """
                                                     Please Enter 3 Unique Choices. No more than two, 3-digit choices. Below are some item codes.
                                                   There are many sources on the web to find more item codes or you could see the README for a list.
                                                                *Just enter the number, do not enter it with square brackets.*
                                         -----------------------------------------------------------------------------------------------------------------------
                                         60 Emerald                        460 Mermaid's Pendant       788 Lost Axe               877 Quality Bobber
                                         64 Ruby                           519 Magnet Ring             791 Golden Coconut         879 Monster Musk
                                         66 Amethyst                       520 Slime Charmer Ring      795 Void Salmon            880 Combined Ring
                                         68 Topaz                          521 Warrior Ring            796 Slimejack              886 Warp Totem: Island
                                         72 Diamond                        522 Vampire Ring            797 Pearl                  887 Immunity Band
                                         73 Golden Walnut                  523 Savage Ring             801 Wedding Ring           888 Glowstone Ring
                                         74 Prismatic Shard                524 Ring of Yoba            803 Iridium Milk           892 Warp Totem: Qi's Arena
                                         80 Quartz                         525 Sturdy Ring             805 Tree Fertilizer        896 Galaxy Soul
                                         82 Fire Quartz                    526 Burglar's Ring          807 Dinosaur Mayonnaise    897 Pierre's Missing Stocklist
                                         166 Treasure Chest                527 Iridium Band            808 Void Ghost Pendant     898 Son of Crimsonfish
                                         201 Complete Breakfast            528 Jukebox Ring            809 Movie Ticket           899 Ms. Angler
                                         227 Sashimi                       645 Iridium Sprinkler       810 Crabshell Ring         900 Legend II
                                         228 Maki Roll                     680 Green Slime Egg         811 Napalm Ring            901 Radioactive Carp
                                         253 Triple Shot Espresso          681 Rain Totem              851 Magma Cap              902 Glacierfish Jr.
                                         261 Warp Totem: Desert            686 Spinner                 852 Dragon Tooth           908 Magic Bait
                                         279 Magic Rock Candy              687 Dressed Spinner         856 Curiosity Lure         910 Radioactive Bar
                                         288 Mega Bomb                     688 Warp Totem Farm         857 Tiger Slime Egg        911 Horse Flute
                                         326 Dwarvish Translation Guide    689 Warp Totem Mountains    859 Lucky Ring             913 Enricher
                                         334 Copper Bar                    690 Warp Totem Beach        860 Hot Java Ring          915 Pressure Nozzle
                                         335 Iron Bar                      691 Barbed Hook             861 Protection Ring        917 Qi Seasoning
                                         336 Gold Bar                      693 Treasure Hunter         862 Soul Sapper Ring       918 Hyper Speed-Gro
                                         337 Iridium Bar                   694 Trap Bobber             863 Phoenix Ring           919 Deluxe Fertilizer
                                         338 Refined Quartz                709 Hardwood                865 Gourmet Tomato Salt    920 Deluxe Retaining Soil
                                         347 Rare Seed                     725 Oak Resin               866 Stardew Valley Rose    921 Squid Ink Ravioli
                                         369 Quality Fertilizer            766 Slime                   867 Advanced TV Remote     921 Soap Stone
                                         371 Quality Retaining Soil        767 Bat Wing                868 Arctic Shard           922-924 SupplyCrate
                                         434 Stardrop                      768 Solar Essence           870 Pirate's Locket        925 Slime Crate
                                         446 Rabbit's Foot                 769 Void Essence            872 Fairy Dust             926 Cookout Kit
                                         454 Ancient Fruit                 773 Life Elixir             873 Pina Colada            928 Golden Egg
                                         458 Bouquet                       787 Battery Pack            876 Prismatic Jelly         -1 Exit Item Menu
                                        """;

                                // Prompt user for item menu choice 1
                                message = new JLabel("<html><pre>" + itemMenu + "</pre></html>");
                                input = JOptionPane.showInputDialog(null,
                                        message, "Item Menu Choice " + choiceNumber,
                                        JOptionPane.QUESTION_MESSAGE);

                                // Handle cancellation or null input (e.g., if the user closes the dialog)
                                if (input == null) {
                                    break;
                                }

                                // Try to parse the input to an integer
                                itemMenuChoice1 = Integer.parseInt(input);

                                if (itemMenuChoice1 == SENTINEL) {
                                    break;
                                }

                                if (itemMenuChoice1 < 0 || itemMenuChoice1 > 999) {
                                    // Handle out of range input
                                    message = new JLabel("<html><pre>" + "Invalid Item" + "</pre></html>");
                                    JOptionPane.showMessageDialog(null,
                                            message, "Item Menu",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                                choiceNumber++;

                                // Prompt user for item menu choice 2
                                input = JOptionPane.showInputDialog(null,
                                        message, "Item Menu Choice " + choiceNumber,
                                        JOptionPane.QUESTION_MESSAGE);

                                // Handle cancellation or null input (e.g., if the user closes the dialog)
                                if (input == null) {
                                    break;
                                }

                                // Try to parse the input to an integer
                                itemMenuChoice2 = Integer.parseInt(input);

                                if (itemMenuChoice2 == SENTINEL) {
                                    break;
                                }

                                if (itemMenuChoice2 < 0 || itemMenuChoice2 > 999) {
                                    // Handle out of range input
                                    message = new JLabel("<html><pre>" + "Invalid Item" + "</pre></html>");
                                    JOptionPane.showMessageDialog(null,
                                            message, "Item Menu",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                                choiceNumber++;

                                // Prompt user for item menu choice 3
                                input = JOptionPane.showInputDialog(null,
                                        message, "Item Menu Choice " + choiceNumber,
                                        JOptionPane.QUESTION_MESSAGE);

                                // Handle cancellation or null input (e.g., if the user closes the dialog)
                                if (input == null) {
                                    break;
                                }

                                // Try to parse the input to an integer
                                itemMenuChoice3 = Integer.parseInt(input);

                                if (itemMenuChoice3 == SENTINEL) {
                                    break;
                                }

                                if (itemMenuChoice3 < 0 || itemMenuChoice3 > 999) {
                                    // Handle out of range input
                                    message = new JLabel("<html><pre>" + "Invalid Item" + "</pre></html>");
                                    JOptionPane.showMessageDialog(null,
                                            message, "Item Menu",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }

                                if (itemMenuChoice1 == itemMenuChoice2 ||
                                        itemMenuChoice2 == itemMenuChoice3 ||
                                        itemMenuChoice1 == itemMenuChoice3) {
                                    message = new JLabel("<html><pre>" + "Please Select Unique Items" + "</pre></html>");
                                    JOptionPane.showMessageDialog(null,
                                            message, "Item Menu",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    continue;
                                }

                                message = new JLabel("<html><pre>" + "Ready?" + "</pre></html>");
                                JOptionPane.showMessageDialog(null, message,
                                        "Item Menu", JOptionPane.INFORMATION_MESSAGE);

                                // Wait 3 seconds to allow user time to change focus to Stardew Valley
                                sara.delay(3000);

                                // Cast item codes as strings
                                String menuChoice1 = String.valueOf(itemMenuChoice1);
                                String menuChoice2 = String.valueOf(itemMenuChoice2);
                                String menuChoice3 = String.valueOf(itemMenuChoice3);

                                // Buy Chicken 1
                                buyChicken(menuChoice1, menuChoice2, menuChoice3);
                                sara.delay(1000);

                                // Buy Chicken 2
                                buyChicken(menuChoice1, menuChoice3, menuChoice2);
                                sara.delay(1000);

                                // Buy Chicken 3
                                buyChicken(menuChoice2, menuChoice1, menuChoice3);
                                sara.delay(1000);

                                // Buy Chicken 4
                                buyChicken(menuChoice2, menuChoice3, menuChoice1);

                                // Ending Message
                                message = new JLabel("<html><pre>" + "Animals Purchased!" + "</pre></html>");
                                JOptionPane.showMessageDialog(null, message,
                                        "Item Menu", JOptionPane.INFORMATION_MESSAGE);

                            } catch (NumberFormatException e) {
                                // Handle non-numeric input
                                message = new JLabel("<html><pre>" + "Invalid Input" + "</pre></html>");
                                JOptionPane.showMessageDialog(null,
                                        message, "Item Menu",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        case 4:
                            // Scythe, Chop, Battle Mode (Auto Clicker)
                            clickFixed();
                            break;
                        case 5:
                            // Exit The Program
                            programContinue = false;
                        default:
                            break;
                    }
                } else {
                    message = new JLabel("<html><pre>" + "Invalid Menu Selection" + "</pre></html>");
                    JOptionPane.showMessageDialog(null,
                            message, "Sara Stardew",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException e) {
                // Handle non-numeric input
                message = new JLabel("<html><pre>" + "Invalid Input" + "</pre></html>");
                JOptionPane.showMessageDialog(null,
                        message, "Sara Stardew",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void buyChicken(String item1, String item2, String item3) {
        // Move mouse directly over Marnie
        sara.mouseMove(724, 728);
        sara.delay(500);
        // Right-click on Marnie
        rightClick();
        sara.delay(500);
        // Move mouse to "Purchase Animals" in the menu
        sara.mouseMove(609, 930);
        sara.delay(500);
        // Left-click on "Purchase Animals"
        leftClick();
        sara.delay(500);
        // Move mouse to "Chicken" in the menu
        sara.mouseMove(794, 309);
        sara.delay(500);
        // Left-click on "Chicken"
        leftClick();
        sara.delay(500);
        // Move mouse to centered chicken coop
        sara.mouseMove(940, 521);
        sara.delay(500);
        // Left-click on chicken coop
        leftClick();
        sara.delay(500);
        // Move mouse to naming box
        sara.mouseMove(908, 561);
        sara.delay(500);
        // Left-click on naming box
        leftClick();
        sara.delay(500);

        // Delete current name of animal by holding backspace
        sara.keyPress(keyInput[14]);
        sara.delay(1000);
        sara.keyRelease(keyInput[14]);
        sara.delay(200);

        // Enter name of chicken
        // Enter item 1
        enterItemCode(item1);
        sara.delay(200);

        // Enter item 2
        enterItemCode(item2);
        sara.delay(200);

        // Enter item 3
        enterItemCode(item3);
        sara.delay(200);

        // Press enter to finish naming
        keyboard(12);
        sara.delay(1500);

        // Left-click to receive items for chicken
        leftClick();
        sara.delay(1000);
        // To ensure you're out of dialogue
        leftClick();
        sara.delay(1000);
    }

    public void enterItemCode(String itemCode) {
        // Ensure item code is validated before this call
        char character;
        // Opening Bracket
        keyboard(10);
        sara.delay(20);

        // Enter Item Code
        for (int i = 0; i < itemCode.length(); i++) {
            character = itemCode.charAt(i);
            keyboard(Integer.parseInt(String.valueOf(character)));
            sara.delay(20);
        }

        // Closing Bracket
        keyboard(11);
        sara.delay(20);
    }

    // Method for single key press
    public void keyboard(int index) {
        // Key Press
        sara.keyPress(keyInput[index]);
        // Duration the key is held down
        sara.delay(10);
        // Key Release
        sara.keyRelease(keyInput[index]);
    }

    public void callGus() {
        // Move mouse directly over the phone
        sara.mouseMove(984, 478);
        sara.delay(1000);
        // Right-click on phone
        rightClick();
        sara.delay(1000);
        // Move mouse to Gus's name one the list
        sara.mouseMove(459, 936);
        sara.delay(1000);
        // Left-click on Gus to call
        leftClick();
        // Wait for Gus to pick up and greet you
        sara.delay(7000);
        // Left-click twice to finish call
        leftClick();
        sara.delay(1500);
        leftClick();
        // Sometimes he rambles
        sara.delay(1500);
        leftClick();
    }

    public void callClint() {
        // Move mouse directly over the phone
        sara.mouseMove(984, 478);
        sara.delay(1000);
        // Right-click on phone
        rightClick();
        sara.delay(1000);
        // Move mouse to Clint's name one the list
        sara.mouseMove(462, 763);
        sara.delay(1000);
        // Left-click on Clint to call
        leftClick();
        // Wait for Clint to pick up and greet you
        sara.delay(7000);
        // Left-click to go to selection menu
        leftClick();
        sara.delay(1500);
        leftClick();
        // Move mouse to the "Hang Up" option
        sara.mouseMove(547, 997);
        sara.delay(1500);
        // Left-click to hang up
        leftClick();
    }

    public void callPierre() {
        // Move mouse directly over the phone
        sara.mouseMove(984, 478);
        sara.delay(1000);
        // Right-click on phone
        rightClick();
        sara.delay(1000);
        // Move mouse to Pierre's name one the list
        sara.mouseMove(480, 822);
        sara.delay(1000);
        // Left-click on Pierre to call
        leftClick();
        // Wait for Pierre to pick up and greet you
        sara.delay(7000);
        // Left-click to go to selection menu
        leftClick();
        sara.delay(1500);
        leftClick();
        // Move mouse to the "Hang Up" option
        sara.mouseMove(547, 997);
        sara.delay(1500);
        // Left-click to hang up
        leftClick();
    }

    public void callFixed(int personToCall) {
        int calls;
        String input;
        Font monospacedFont = new Font("Monospaced", Font.PLAIN, 12);
        JLabel message = new JLabel();
        message.setFont(monospacedFont);
        try {
            // Prompt user for menu choice
            message = new JLabel("<html><pre>" + "How many calls would you like to make? (1-100)" + "</pre></html>");
            input = JOptionPane.showInputDialog(null,
                    message, "Call Menu",
                    JOptionPane.QUESTION_MESSAGE);

            // Handle cancellation or null input
            if (input == null) {
                return;
            }

            // Try to parse the input to an integer
            calls = Integer.parseInt(input);

            // Check if the choice is valid
            if (calls >= 1 && calls <= 100) {
                message = new JLabel("<html><pre>" + "Ready?" + "</pre></html>");
                JOptionPane.showMessageDialog(null, message,
                        "Call Menu", JOptionPane.INFORMATION_MESSAGE);

                // Wait 3 seconds to allow user time to change focus to Stardew Valley
                sara.delay(3000);

                for (int i = 1; i <= calls; i++) {
                    if (personToCall == 1) {
                        callClint();
                    } else if (personToCall == 2) {
                        callPierre();
                    } else if (personToCall == 3) {
                        callGus();
                    }
                }

                // Ending Message
                message = new JLabel("<html><pre>" + "Calling Complete!" + "</pre></html>");
                JOptionPane.showMessageDialog(null, message,
                        "Call Menu", JOptionPane.INFORMATION_MESSAGE);
            } else {
                message = new JLabel("<html><pre>" + "Invalid Call Amount" + "</pre></html>");
                JOptionPane.showMessageDialog(null,
                        message, "Call Menu",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            // Handle non-numeric input
            message = new JLabel("<html><pre>" + "Invalid Input" + "</pre></html>");
            JOptionPane.showMessageDialog(null,
                    message, "Call Menu",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void callAuto(int peopleToCall) {
        Font monospacedFont = new Font("Monospaced", Font.PLAIN, 12);
        JLabel message = new JLabel();
        message.setFont(monospacedFont);
        message = new JLabel("<html><pre>" + "Ready?" + "</pre></html>");
        JOptionPane.showMessageDialog(null, message,
                "Sara Stardew", JOptionPane.INFORMATION_MESSAGE);

        // Wait 3 seconds to allow user time to change focus to Stardew Valley
        sara.delay(3000);

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
            if (peopleToCall == 1) {
                callClint();
            } else if (peopleToCall == 2) {
                callPierre();
            }
        }

        // The pixel values for 10:10pm and 11:00pm are identical,
        // this acts as a safeguard against endless calling.
        Color isElevenPm = new Color(34, 17, 34);
        Color isElevenPm2 = new Color(221, 148, 84);
        Color isElevenPm3 = new Color(34, 17, 34);

        boolean elevenPm = false;
        while (!elevenPm) {
            // Checking pixel pattern in time area at start of loop
            Color isItElevenPm = sara.getPixelColor(1757, 114);
            Color isItElevenPm2 = sara.getPixelColor(1775, 116);
            Color isItElevenPm3 = sara.getPixelColor(1823, 116);

            if (Objects.equals(isItElevenPm, isElevenPm)) {
                if (Objects.equals(isItElevenPm2, isElevenPm2)) {
                    if (Objects.equals(isItElevenPm3, isElevenPm3)) {
                        // If it is eleven pm, stop calling
                        elevenPm = true;
                    }
                }
            }
            callGus();
        }

        // Ending Message
        message = new JLabel("<html><pre>" + "Calling Complete!" + "</pre></html>");
        JOptionPane.showMessageDialog(null, message,
                "Sara Stardew", JOptionPane.INFORMATION_MESSAGE);
    }

    public void clickFixed() {
        int clicks;
        String input;
        Font monospacedFont = new Font("Monospaced", Font.PLAIN, 12);
        JLabel message = new JLabel();
        message.setFont(monospacedFont);
        try {
            /* This auto clicker clicks once per second allowing you to walk around while it's clicking.
Great for chopping, scything, or battling. Ensure you have food ready to eat on your tab.
You may need to scroll over it if you are low on energy.*/
            // Prompt user for menu choice
            message = new JLabel("""
                    <html><pre>\
                    *****************************************************************************************
                    This auto clicker clicks once per second allowing you to walk around while it's clicking.
                    Great for chopping, scything, or battling. Ensure you have food ready to eat on your tab.
                                  You may need to scroll over it if you are low on energy.
                    *****************************************************************************************
                    
                                     How many clicks would you like to perform? (1-300)
                                               Enter -1 to exit auto clicker.
                    </pre></html>""");
            input = JOptionPane.showInputDialog(null,
                    message, "Click Menu",
                    JOptionPane.QUESTION_MESSAGE);

            // Handle cancellation or null input
            if (input == null) {
                return;
            }

            // Try to parse the input to an integer
            clicks = Integer.parseInt(input);

            if (clicks == -1) {
                return;
            }

            // Check if the choice is valid
            if (clicks >= 1 && clicks <= 300) {
                message = new JLabel("<html><pre>" + "Ready?" + "</pre></html>");
                JOptionPane.showMessageDialog(null, message,
                        "Click Menu", JOptionPane.INFORMATION_MESSAGE);

                // Wait 3 seconds to allow user time to change focus to Stardew Valley
                sara.delay(3000);

                for (int i = 1; i <= clicks; i++) {
                    leftClick();
                    sara.delay(1000);
                }

                // Ending Message
                message = new JLabel("<html><pre>" + "Clicking Complete!" + "</pre></html>");
                JOptionPane.showMessageDialog(null, message,
                        "Click Menu", JOptionPane.INFORMATION_MESSAGE);
            } else {
                message = new JLabel("<html><pre>" + "Invalid Click Amount" + "</pre></html>");
                JOptionPane.showMessageDialog(null,
                        message, "Click Menu",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            // Handle non-numeric input
            message = new JLabel("<html><pre>" + "Invalid Input" + "</pre></html>");
            JOptionPane.showMessageDialog(null,
                    message, "Click Menu",
                    JOptionPane.INFORMATION_MESSAGE);
        }
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
