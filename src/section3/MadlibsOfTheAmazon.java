package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		String hello;
		JOptionPane.showMessageDialog (null," If you find yourself having to cross a piranha-infested river, here's how to do it..."); 
				
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
		
		String adjective=JOptionPane.showInputDialog("enter an adjective");

		// Get the user to enter a type of liquid
		String typeOfLiquid=JOptionPane.showInputDialog("enter a type of liquid");

		// Get the user to enter a body part
		String typeBodyPart=JOptionPane.showInputDialog("enter a body part");

		// Get the user to enter a verb
		String enterVerb=JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
		 String place=JOptionPane.showInputDialog("enter a place");
		
		 
				 
		 
		 // Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [fierce] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [pee] and will most
		// likely take a bite out of your [legs] if you [die]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [souplantation]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		 

	}
}

