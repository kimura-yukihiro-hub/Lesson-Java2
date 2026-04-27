package javanew.Sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class AnoonimousClassTest3 {
	public static void main(String[] args) {
		//1秒ごとに実行する無名内部クラスを定義
		ActionListener task = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Tick");
			}
		};
		//Timerインスタンスを作成
		Timer timer = new Timer(1000, task);

		//タイマー開始
		timer.start();
		//プログラムがすぐに終了しないようにダイアログを表示して待機
		javax.swing.JOptionPane.showMessageDialog(null,"OKを押すと停止します" );

	}

}
