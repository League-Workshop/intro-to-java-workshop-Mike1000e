package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		  String question = JOptionPane.showInputDialog ("Do you know how to code?" );
		// 2. If they say "yes", tell them they will rule the world.
		  if(question.equalsIgnoreCase("yes")){
			JOptionPane.showMessageDialog(null, "You will rule the WORLD!!!!!!" );
			
		  } else {
			  JOptionPane.showMessageDialog(null, "Better start until it's too late." );
		  }
		  
		  
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

