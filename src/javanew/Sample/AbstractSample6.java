package javanew.Sample;

abstract class Device {
	public final void powerOn() {
		System.out.println("デバイスの電源をオンにします。");
	}
}

class Computer extends Device {
	public void userDevice() {
		System.out.println("コンピュータを使用して作業を開始します。");
	}
}
public class AbstractSample6 {
	public static void main(String[] args) {
		Computer myPc = new Computer();
		
		myPc.powerOn();
		myPc.userDevice();
	}

}
