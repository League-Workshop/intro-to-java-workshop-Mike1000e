package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot Mike = new Robot();
		Mike.setSpeed(5);
		
		Mike.setPenColor(Color.blue);
		
		Mike.penDown(
					);
		Mike.move(100);
		
		Mike.turn(90);
		
		Mike.setPenColor(Color.ORANGE);
		
		Mike.move(100);
		
		Mike.turn(90);
		
		Mike.setPenColor(Color.BLACK);
		
		Mike.move(100);
		
		Mike.turn(90);
		
		Mike.setPenColor(Color.green);
		
		Mike.move(100);
		
		Mike.penUp();
		
		Mike.setSpeed(10);
	
		Mike.turn(90);
		
		Mike.move(-100);
		
		Mike.turn(100000);
		
		
	}
}
