package javanew.Sample;

abstract class Appliance {
	public abstract void turnOn();

	public abstract void turnOff();
}

abstract class KitchenAppliance extends Appliance {
	@Override
	public void turnOn() {
		System.out.println("キッチン家電の電源をオンにします。。");
	}
}

class Microwave extends KitchenAppliance {
	@Override
	public void turnOff() {
		 System.out.println("電子レンジの電源をオフにします。");
	}
}
public class AbstractSample7 {
	public static void main(String[] args) {
		Microwave myMicrowave = new Microwave();
		myMicrowave.turnOn();
		myMicrowave.turnOff();
	}

}
