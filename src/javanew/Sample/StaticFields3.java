package javanew.Sample;

class Configuration {
	static String appName;
	static String version;

	// 静的初期化ブロック
	// クラスがロードされた時に一度だけ実行される
	static {
		appName = "MySuperApp";
		version = "1.0.1";
		System.out.println("--- 静的初期化ブロックが実行されました ---");

	}

	// 値を表示するための静的メソッド
	static void displayConfig() {
		System.out.println("アプリ名:" + appName);
		System.out.println("バージョン:" + version);
	}
}

public class StaticFields3 {
	public static void main(String[] args) {
		Configuration.displayConfig();
	}

}
