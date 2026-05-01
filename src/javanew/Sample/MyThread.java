package javanew.Sample;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Hello from MyThewad");
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("Hello from main");
	}

}
