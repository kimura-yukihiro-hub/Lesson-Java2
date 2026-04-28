package com.example.app;

//import com.example.utils.Helper; ← ここでエラー（Helperが見えないため）
public class NameSpace5 {
	public static void main(String[] args) {
		// Helper helper = new Helper(); ← ここもエラーになります
		System.out.println("NameSpace5: 別のパッケージの Helper にはアクセスできません。");
	}

}
