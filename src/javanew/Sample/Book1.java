package javanew.Sample;

class Book2 {
	String title;
	String author;
	int price;

	Book2(String title, String author) {
		this.title = title;
		this.author = author;
		this.price = 1000;
	}

	Book2(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	Book2() {
		this.price = 0;
	}

	void displayInfo() {
		System.out.println("タイトル:" + title + ",著者:" + ",価格:" + price);
	}
}

public class Book1 {
	public static void main(String[] args) {
		Book2 book1 = new Book2("Java基礎入門", "田中太郎", 2980);
		book1.displayInfo();
		Book2 book2 = new Book2("Java基礎応用", "田中太郎", 3980);
		book2
		
		
		.displayInfo();
	}
}
