package javanew.Sample;

//Counterクラスの作成
class Counter {
	//静的フィールドcountの定義
	// 全てのインスタンスで共有される変数になります
	static int count = 0;

	// countをインクリメントするメソッド
	void increment() {
		count++;
	}
}

public class StaticFields1 {
	public static void main(String[] args) {
		// 複数のインスタンスを生成
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		// それぞれのインスタンスからメソッドを呼び出す
		c1.increment();
		c2.increment();
		c3.increment();

		// 最終的なcountの値を表示
		// 静的フィールドなので、どのインスタンスから参照しても同じ値（3）が表示されます
		System.out.println("現在のカウント:" + Counter.count);

	}

}
