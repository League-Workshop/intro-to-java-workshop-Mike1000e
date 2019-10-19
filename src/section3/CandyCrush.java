package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
			String sport = JOptionPane.showInputDialog("What sport do you play? ");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "I really don't like "+ sport +"!" );
		// 3. Ask the user for the name of their best friend
			String sportLike = JOptionPane.showInputDialog("What sport do you hate? ");
		// 4. Tell them their best friend is as sweet as candy
			JOptionPane.showMessageDialog(null, "Dude " + sportLike + " sucks." );
	} 
}



