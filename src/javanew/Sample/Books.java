package javanew.Sample;

class Book {
	String title;
	String author;
	int price;

	//本の情報を表示
	void showInfo() {
		System.out.println("タイトル:" + title + ",著者:" + author + ",価格:" + price);

	}
}

public class Books {
	public static void main (String[] args) {
		Book book1 = new Book();
		
		book1.title = "Java入門";
		book1.author = "田中太郎";
		book1.price = 2980;
		
		book1.showInfo();
	}

}
