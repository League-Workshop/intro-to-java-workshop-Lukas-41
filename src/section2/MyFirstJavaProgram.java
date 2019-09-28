package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot web =new Robot();
web.setSpeed(100);
web.move(50);
web.sparkle();
web.move(100);		
web.turn(-90);		
web.turn (900);
web.move(100);
web.turn(-100);
Robot seb =new Robot();
seb.move(100);
seb.turn (90);
seb.setSpeed(100);
Robot meb =new Robot();
meb.turn(90);
web.turn (-90);
web.move (100);
web.turn (-900);
web.move (600);
seb.move (600);
meb.setSpeed (1000);
meb.move (500);
Robot beb =new Robot ();
Robot sad =new Robot ();
Robot mad =new Robot ();
Robot bad =new Robot ();
beb.penDown();
beb.move (100);
beb.turn (90);
beb.move (100);
beb.turn (-90);
beb.move (100);
beb.turn (90);
beb.move (100);
beb.turn (90);
beb.move (100);
beb.turn (-90);
beb.move (100);
beb.penUp ();
beb.move (100);
sad.move (100);
sad.turn (90);
sad.move (50);
sad.turn (-90);
mad.move (100);
mad.turn (90);
mad.move (100);

	} 

}
