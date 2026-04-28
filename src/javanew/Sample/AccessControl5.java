package javanew.Sample;

class BankAccount {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	// 入金するためのメソッド
	public void deposit(int amount) {
		// お金がプラスの時だけ入金処理をする
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + "円入金しました。");
		} else {
			System.out.println("入金額が正しくありません。");
		}
	}
}
public class AccessControl5 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.deposit(500);
		account.deposit(1000);
		
		System.out.println("現在の残高:" + account.getBalance() + "円");
	}

}
