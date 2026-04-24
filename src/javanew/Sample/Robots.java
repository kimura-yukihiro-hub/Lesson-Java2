package javanew.Sample;

class Robot {
	String move;
	
	//動作を表示するメソッド
	void showMove() {
		System.out.println("この動作は、" + move + "ます。");
	}
}
public class Robots {
	public static void main(String[] args) {
		//インスタンスを定義
		Robot robot1 = new Robot();
		Robot robot2 = new Robot();
		Robot robot3 = new Robot();
		Robot robot4 = new Robot();
		//それぞれの動作を指定する
		robot1.move = "右に曲がり";
		robot2.move = "左に曲がり";
		robot3.move = "前に進み";
		robot4.move = "後ろに下がり";
		//表示する
		robot1.showMove();
		robot2.showMove();
		robot3.showMove();
		robot4.showMove();
	}

}
