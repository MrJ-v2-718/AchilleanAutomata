# BoulderFarm

	BoulderFarm and BoulderFarmLite are programs that automate the rune farm at Lenne's Rise.
----------------------------------------------------------------------------------------------------		

	BoulderFarm Version 3.0
	-----------------------
		The latest version (3.0) is capable over 300 laps, which takes around 3 hours complete. Each lap 
	takes 37.34 seconds. It's performance has improved from 130 laps on version 2.0, and 80 on version 1.0.
	BoulderFarm has extra features such as calculating the time to complete the specified route, displays 
	the runes earned from the route with and without the use of a Golden Scarab, and displays the starting 
	and ending times.

	BoulderFarmLite Version 3.0
	---------------------------
		The exact same rune farming route, but no bells and whistles. The program starts, prompts the user
	for a specified number of laps. The next box prompts the user that the program will start 3 seconds
	after pressing the OK button (or pressing ENTER) and displays total laps. The program runs the laps 
	and then displays a box showing that the farming has been completed and again displays the total laps.
	The latest version (3.0) is capable of more than 300 laps. Version 2.0 experienced performance issues 
	at 140 but after a manual correction, completed it's route. Version 1.0 clocked in at 130 laps.


Instructions:
------------------------------------------------------------------------------------------
1. Download Java

	On Linux:
		
	Open a terminal and type the following command:

		sudo apt install openjdk-21-jdk
	
Note: apt is package manager for debian branch linux systems,
if you're on something else just use your package manager. (e.g. yum, pacman, dnf, etc...)
Also, verify your java repository name. The one I list is for Ubuntu Jammy Jellyfish.

	On Windows:

		Search for Oracle Java JDK 21 and download it.

Note: Other versions of the Java JDK might work, but I used 21 to make it.


2. Download the latest release of BoulderFarm or BoulderFarmLite on GitHub.


3. Compile the downloaded .java file.

	On Linux and Windows:

		Open Terminal and navigate to the directory with the BoulderFarm3.java or 
	BoulderFarmLite3.java file. You can navigate directories with the cd command.

	Type the following command:

		javac BoulderFarm3.java
				or
		javac BoulderFarmLite3.java

This should create a file called BoulderFarm3.class or BoulderFarmLite3.class.


4. Start Elden Ring and travel to Lenne's Rise site of grace.

		If you do not have this site of grace, there are many online guides that can 
		help you to get there. Traveling there is not covered in this guide.


5. Close all other windows and programs besides Elden Ring and your Terminal or PowerShell window.


6. Find a comfortable place to rest your mouse. Now don't touch it, not even a little bit.


7. Use "G" to pull up your map and zoom all the way in.


8. Use the "WASD" keys to navigate to Lenne's Rise and press "E" to select it and "E" again to confirm.


9. Once you have loaded in, press alt + tab to switch over to your window of Terminal or PowerShell. 


10. Start the program.

	On Linux and Windows:

	Type the following command:

		java BoulderFarm3
			   or
		java BoulderFarmLite3

	Note: Do not include the .class extension in the command above.


11. Enter the desired number of laps.


12. Press OK or ENTER and then press alt + tab to hide the window of Terminal or PowerShell.


13. Don't touch anything. Don't think about touching it. Don't think about thinking about 
touching it. Just don't touch it. Go outside, touch some grass or something.


14. Notification tells you when it's done. Ta da. Have some runes!


15. Rinse and repeat.


	PLEASE BE ADVISED:
---------------------------------------------------------------------------------------------------
	
	A runaway Java bot cannot be turned off. This means if you accidentally touched your mouse
	or keyboard, even though I explicitly told you not to, then the program will continue to run until
	it's done. This means even if you close Elden Ring, it will still be pressing all the keys like it's
	still playing the game. The only way to stop this is by holding down the power button on your PC.

