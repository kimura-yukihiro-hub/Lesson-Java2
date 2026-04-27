package javanew.Sample;

class Car3 {
	String model;
	int year;
	//デフォルトコンストラクター
	Car3() {
		this.model = "未設定";
		this.year = 0;
	}
	//引数付きコンストラクター
	Car3(String model, int year) {
		this.model = model;
		this.year = year;
	}
	void display() {
		System.out.println("車種: " + model + ", 年式: " + year);
	}
}
public class Car2 {
	public static void main(String[] args) {
		Car3  car1 = new Car3();
		car1.display();
		Car3 car2 = new  Car3("プリウス", 2023);
		car2.display();
	}

}
