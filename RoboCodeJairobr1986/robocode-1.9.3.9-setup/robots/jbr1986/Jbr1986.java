package jbr1986;
import robocode.*;

import java.awt.Color;
/**
 * jbr1986 - a class by (your name here)
 */
public class Jbr1986 extends Robot {
    public void run() {
        setColors(Color.darkGray, Color.black, Color.lightGray, Color.white, Color.green);
		while(true) {
				ahead(100);
				turnLeft(90);
		}
    }
	//tank robo detectado
	public void onScannedRobot (ScannedRobotEvent e) {
		String robotank = e.getName();
		double distancia = e.getDistance();
		System.out.println(robotank + "Distancia " + distancia);
		if (distancia < 135) {
			fire(3);
			} else { 
				fire(1);
		}
	}
	//colisão com a parede
	public void onHitWall(HitWallEvent e) {
		back(50);
		turnLeft(90);
	}
}
