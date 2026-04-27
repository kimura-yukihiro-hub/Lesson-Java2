package javanew.Sample;

class Rectangle1 {
	int width;
	int height;

	//幅と高さのコンストラクター
	Rectangle1(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//幅のコンストラクター
	Rectangle1(int width) {
		this(width, width);
	}

	void displayInfo() {
		System.out.println("幅: " + width + ",高さ: " + height);
	}
}

public class OverRoad2 {
	public static void main(String[] args) {
		Rectangle1 rect = new Rectangle1(10,20);
		Rectangle1 square = new Rectangle1(15);
		
		rect.displayInfo();
		square.displayInfo();
	}

}
