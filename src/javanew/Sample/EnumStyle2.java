package javanew.Sample;

enum Season {
	SPRING, SUMMER, AUTUMN, WINTER
}
public class EnumStyle2 {
	public static void main(String[] args) {
		Season season = Season.SPRING;
		System.out.println("現在の季節:" +season);
		switch (season) {
		case SPRING:
			System.out.println("春ですね。桜がきれいです。");
			break;
		case SUMMER:
			System.out.println("夏ですね。花火がきれいです。");
			break;
		case AUTUMN:
			System.out.println("秋ですね。紅葉がきれいです。");
			break;
		case WINTER:
			System.out.println("冬ですね。雪がきれいです。");
			break;
			
		}
	}

}
