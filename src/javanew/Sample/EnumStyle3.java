package javanew.Sample;

enum TrafficLight {
	RED, YELLOW, BLUE;

	public String getMessage() {
		switch (this) {
		case RED:
			return "止まれ";
		case YELLOW:
			return "注意";
		case BLUE:
			return "進め";
		default:
			return "";
		}
	}
}

public class EnumStyle3 {
	public static void main(String[] args) {
		// 全ての信号の色をループで回してメッセージを表示
		for (TrafficLight light : TrafficLight.values()) {
		System.out.println(light + "の意味:" + light.getMessage());;

	}
	}
}
