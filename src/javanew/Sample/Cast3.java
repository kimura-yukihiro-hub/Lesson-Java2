package javanew.Sample;

//Shapeインターフェースの定義
interface Shape {
	void draw();
}
//Circle2クラスでの実装
class Circle2 implements Shape {
	public void draw() {
		System.out.println("円を描きます");
	}
	//Circle2独自のメソッド
	public void showRadius() {
		System.out.println("半径は5です");
	}
}
//Rectangle2クラスの実装
class Rectangle2 implements Shape {
	public void draw() {
		System.out.println("四角形を描きます");
	}
	//Rectangle2独自のメソッド
	public void showArea() {
		System.out.println("面積は20です");
	}
}
public class Cast3 {
	public static void main(String[] args) {
		// Shape型の配列に異なる子クラスのインスタンスを格納
		Shape[] shapes = { new Circle2(), new Rectangle2() };
		
		for (Shape s : shapes) {
			s.draw(); //共通メソッドの呼び出し
			
			//instanceofを使用して安全にキャストし、特定のメソッドを呼び出す
			if (s instanceof Circle2) {
				Circle2 c = (Circle2) s;
				c.showRadius(); //Circle2特有のメソッド
			} else if (s instanceof Rectangle2) {
				Rectangle2 r = (Rectangle2) s;
				r.showArea(); //Rectangle2特有のメソッド
			}
			System.out.println("---");
		}
	}

}
