package com.example.service;

import com.example.model.User;

public class UserService {
	public void register(User user) {
		System.out.println("【サービス層】" + user.name + "さんをデータベースに登録しました。");
	}

}
