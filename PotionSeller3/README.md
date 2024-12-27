# PotionSeller 

PotionSeller is a program that automates the rapid selling of items in Baldur's Gate 3.
----------------------------------------------------------------------------------------------------		

PotionSeller Version 3.0
----------------------------------------------------------------------------------------------------		
Sells items at a rate of 1000 per second. Input validation and exception handling added.


Instructions:

1. Download Java

	On Linux:
		
	Open a terminal and type the following command:

		sudo apt install openjdk-21-jdk
	
Note: apt is package manager for debian branch linux systems,
if you're on something else just use your package manager. (e.g. yum, pacman, dnf, etc...)
Also, verify your java repository name. The one I list is for Ubuntu Jammy Jellyfish.

On Windows:

Search for Oracle Java JDK 21 and download it.

Note: Other versions of the Java JDK will work, but I used 21.


2. Download the latest release of PotionSeller on GitHub.


3. Compile the downloaded .java file.

	On Linux and Windows:

	Open Terminal/PowerShell and navigate to the directory with the PotionSeller.java file. 
	You can navigate directories with the cd command.

	Type the following command:

		javac PotionSeller.java

This should create a file called PotionSeller.class


4. Start Baldur's Gate 3 and travel to a merchant.


5. Ensure you are in the merchants TRADE menu.


6. Close or minimize all other windows and programs besides Baldur's Gate 3 and your Terminal or PowerShell window.


7. Once you have loaded in, press alt + tab to switch over to your window of Terminal or PowerShell. 


8. Start the program.

	On Linux and Windows:

	Type the following command:

		java PotionSeller

	Note: Do not include the .class extension in the command above.


9. Enter the desired number of clicks. 


10. Press OK or ENTER and then press alt + tab to hide the window of Terminal or PowerShell.


11. The clicks will start after exactly 3 seconds. Make sure you are hovered over the items you wish to sell.
Ensure these items are not in a stack, because you will get stuck in the split stack menu. The best way to 
do this is to have a long line of weapons to sell.


12. You will see the items sell, as well as your gold and the merchant's gold accumulate.


13. Rinse and repeat.


PLEASE BE ADVISED:
---------------------------------------------------------------------------------------------------
A runaway Java bot can be unwieldy. The only way to stop it is by holding down the power button on 
your PC or Ctrl+C in the terminal. The former is a last resort.
