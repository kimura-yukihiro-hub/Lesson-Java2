package javanew.Sample;

public class Main {
	public static void main(String[] args) {
		//Taiyakiクラスのインスタンスを二つ作成
		Taiyaki taiyaki1 = new Taiyaki();
		Taiyaki taiyaki2 = new Taiyaki();
		//中身をセットするメソッド
		taiyaki1.setFilling("クリーム");
		taiyaki2.setFilling("あんこ");
		//中身を表示するメソッド
		taiyaki1.showFilling();
		taiyaki2.showFilling();
	}

}
