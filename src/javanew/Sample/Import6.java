package javanew.Sample;

import static java.lang.Math.*;
public class Import6 {
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		
		double xSquared = pow(x,2);
		double ySquared = pow(y,2);
		
		double hypotenuse = sqrt(xSquared + ySquared);
		
		System.out.println("底辺:" + x + ".高さ:" + y + ",三角形の斜辺:" + hypotenuse);
	}

}
