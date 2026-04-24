package javanew.Sample;

public class Car {
	String model;
	int speed;
	void showInfo() {
		System.out.println("車の車種は" + model + "で、スピードは" + speed +"kmです。");
	}
		public static void main(String[] args) {
			//インスタンスを生成
			Car car1 = new Car();
			Car car2 = new Car();
			Car car3 = new Car();
			Car car4 = new Car();
			//車種とスピードを設定
			car1.model = "ホンダ";
			car1.speed = 140;
			car2.model = "トヨタ";
			car2.speed = 150;
			car3.model = "日産";
			car3.speed = 160;
			car4.model = "マツダ";
			car4.speed = 170;
			//表示する
			car1.showInfo();
			car2.showInfo();
			car3.showInfo();
			car4.showInfo();
		}
	}




