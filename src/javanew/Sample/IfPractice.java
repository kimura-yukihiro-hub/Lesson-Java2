package javanew.Sample;

public class IfPractice {
	public static void main (String[] args) {
		//1.
		int a = 50;
		int b = 50;
		if (a == b) {
			System.out.println("aとbの値は同じ");
		}
		//2.
		boolean isRainy = true;
		
		if (isRainy) {
			System.out.println("傘を持っていきましょう。");
		}
		//3.
		int temperature = 25;
		if (temperature >= 30) {
			System.out.println("真夏日です。");
		} else { 
			System.out.println("真夏日ではありません。");
		}
		//4.
		int score = 75;
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		//5.
		int time = 14;
		boolean isHoliday = false;
		
		if (time >= 9 && time <= 18 && !isHoliday) {
			System.out.println("勤務時間内です。");
		} else {
			System.out.println("勤務時間外です。");
		}
		//5.
		boolean hasLicense = true;
		boolean hasCar = true;
		
		if (hasLicense) {
			System.out.println("運転免許を持っています。");
			if (hasCar) {
				System.out.println("車も持っています。");
			} else {
				System.out.println("しかし、車は持っていない。");
			}
		} else {
			System.out.println("運転免許を持っていません。");
		}
		//6.
		String color = "yellow";
		String message;
		switch (color) {
		case "red":
			message = "停止してください。";
			break;
		case "yellow":
			message = "注意してください。";
			break;
		case "green":
			message = "進んでください。";
			default:
				message = "不正な信号の色です。";
		}
		System.out.println("現在の信号:" + color + "-" + message);
		//7. while文
		int i =0;
		while (i < 3) {
			System.out.println(i);
			i ++;
		}
		//8. do-while文
		int I = 7;
		do {
			System.out.println(I);
			I++;
		} while (I < 3);
		//9. for文
		for (int p = 0; p < 3; p++) {
			System.out.println(p);
		}
		//10. 拡張for文
		int[] numbers = {0, 1, 2};
		for (int n : numbers) {
			System.out.println(n);
		}
		//11. for文と拡張for文の違い
		for (int t = 0; t < numbers.length; t++) {
		    System.out.println(numbers[t]);
		}
		for (int n : numbers) {
		    System.out.println(n);
		}
		//12. break
		for (int r = 0; r < 5; r++) {
			if (r == 3) {
				break;
			}
			System.out.println(r);
		}


	}

}
