package javanew.Sample;

public class Calculate {
	public static double calcArea(double radius) {
		//π * r^2
		return Math.PI * radius * radius;
	}
	public static void main(String[] args) {
		double r = 6.2;
		double area = calcArea(r);
		
		System.out.println("半径" + r + "の円の半径は:" + area);
	}

}
