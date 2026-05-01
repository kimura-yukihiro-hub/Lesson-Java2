package javanew.Sample;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello from a thread!");
	}
	
}
public class Thred1 {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread = new Thread(myRunnable);
		thread.start();
	}

}
