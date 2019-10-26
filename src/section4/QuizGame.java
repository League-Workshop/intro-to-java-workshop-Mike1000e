package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 

		int score = 0;
		System.out.println(score);
		// 2.  Ask the user a question 
		String question1 = JOptionPane.showInputDialog(null, "What is the most subsribed YouTube chanell?");
		
		if (question1.equalsIgnoreCase("tseries") || (question1.equalsIgnoreCase("t series"))) {
			score = score ++;
			JOptionPane.showMessageDialog(null, "Correct");
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
			}
		
String question2 = JOptionPane.showInputDialog(null, "What is the YouTuber who wastes the most money?");
		
		if (question2.equalsIgnoreCase("mrbeast") || (question1.equalsIgnoreCase("mr beast"))) {
			score = score ++;
			JOptionPane.showMessageDialog(null, "Correct");
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
			}
String question3 = JOptionPane.showInputDialog(null, "What youtuber brought back Minecraft?");
		
		if  (question3.equalsIgnoreCase("Pewdiepie")) {
			score = score ++;
			JOptionPane.showMessageDialog(null, "Correct");
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
			}
		
		
		// 4.  if the user's answer was correct, add one to their s
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	
}}
