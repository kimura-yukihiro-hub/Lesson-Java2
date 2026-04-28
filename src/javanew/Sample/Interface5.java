package javanew.Sample;

interface Printer {
	// 抽象メソッド（子クラスで必ず中身を書く）
	void print();
	
	// default メソッド（共通の処理を書いておける）
	default void showStatus() {
		 System.out.println("プリンターの状態は良好です。");
	}
}

class LaserPrinter implements Printer {
	@Override
	public void print() {
		System.out.println("レーザープリンターで印刷しています。");
	}
}
public class Interface5 {
	public static void main(String[] args) {
		LaserPrinter lp = new LaserPrinter();
		
		lp.print();
		lp.showStatus();
	}

}
