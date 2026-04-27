package javanew.Sample;

public class AnonymousClassTest1 {
	public static void main(String[] args) {
		//Runableインターフェースを実装する無名内部クラスを作成
		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello, World!");
			}
		};
		Thread thread = new Thread(task);
		thread.start();
	}

}
