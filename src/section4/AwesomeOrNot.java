package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
    Random rndmNmbr = new Random();
	// 3. Print out this variable
    int number = rndmNmbr.nextInt(4);
    System.out.println(number);
	// 4. Get the user to enter something that they think is awesome
    String awsome = JOptionPane.showInputDialog(null, "What is one thing you think is awsome?");
	// 5. If the random number is 0
    if (number == 0){
    	JOptionPane.showMessageDialog(null, awsome + " is awsome!!");
     }
	// -- tell the user whatever they entered is awesome!
    if (number == 1){
    	JOptionPane.showMessageDialog(null, awsome + " is ok.");
     }
	// 6. If the random number is 1
    if (number == 2){
    	JOptionPane.showMessageDialog(null, awsome + " is so boring.");
     }
	// -- tell the user whatever they entered is ok.
    if (number == 3){
    	JOptionPane.showMessageDialog(null, awsome + " is the worst thing in the world!!!!");
     }
	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}}


