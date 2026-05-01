package javanew.Sample;

class Counter1 {
	private int count = 0;
	 // synchronized キーワードでメソッドをスレッドセーフにする
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
public class Thread2 {
	public static void main(String[] args) throws InterruptedException {
		Counter1 counter = new Counter1();
		
		// 1000回カウントアップする処理
		Runnable task = () -> {
			for (int i =0; i < 1000; i++) {
				counter.increment();
			}
		};
		
		// 2つのスレッドを開始
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
		
		t1.join(); // 終了を待つ
		t2.join();
		
		System.out.println("最終カウント:" + counter.getCount());
	}

}
