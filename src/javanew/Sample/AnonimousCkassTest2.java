package javanew.Sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonimousCkassTest2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("テスト");
		JButton button = new JButton("クリックしてね");
		//ActionListenerインターフェースを実装する無名内部クラスを作成
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//ボタンが押された時の処理
			}
		});
		//画面の表示設定
		frame.add(button);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
