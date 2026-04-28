package com.example.utils;

class Helper {
	void showMessage() {
		System.out.println("Helper:同じパッケージ内から呼び出されました。");
	}
}
public class Test {
	public static void main(String[] args) {
		Helper helper = new Helper();
		helper.showMessage();
	}

}
