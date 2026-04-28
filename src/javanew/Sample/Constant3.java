package javanew.Sample;

class AppConfig {
	public static final String APP_NAME = "MyApp";
	public static final String VERSION = "1.0.0";
}
public class Constant3 {
	public static void main(String[] args) {
		// 定数を使用して情報を表示
		System.out.println("名前:" + AppConfig.APP_NAME);
		System.out.println("Ver:" + AppConfig.VERSION);
	}

}
