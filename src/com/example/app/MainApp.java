package com.example.app;

import com.example.model.User;
import com.example.service.UserService;

public class MainApp {
	public static void main(String[] args) {
		//データを作る
		User newUser = new User("木村");

		//ービスを呼び出して処理する
		UserService service = new UserService();
		service.register(newUser);
		
		System.out.println("【アプリ層】登録処理が完了しました。");

	}

}
