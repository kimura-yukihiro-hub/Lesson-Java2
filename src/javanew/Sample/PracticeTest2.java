package javanew.Sample;

public class PracticeTest2 {
	public static void main(String[] args) {
		//問題1
		final int TAX = 10;
		System.out.println("消費税率:" + TAX + "%");
		//問題2
		int x = 480;
		double price = x + x * ((double) TAX / 100);
		System.out.println("消費税込み金額:" + price);
		//問題3
		String name = "木村倖大";
		System.out.println(name);
		//問題4
		String goods = "この商品の値段は";
		String cash = "円です";
		System.out.println(goods + price + cash);
	}

}
