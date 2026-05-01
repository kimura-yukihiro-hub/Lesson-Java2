package javanew.Sample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//カスタムアノテーションの定義
//実行時（Runtime）にも情報を保持するように設定
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
	String value();
}

//クラスにアノテーションを適用
@MyAnnotation("これはマイクラスです")
class MyClass {

}

public class ReflectionAnnotation2 {
	public static void main(String[] args) {
		//リフレクションを使ってアノテーション情報を取得
		Class<MyClass> clazz = MyClass.class;
		MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
		
		//内容を表示
		if (annotation != null) {
				System.out.println("アノテーションの値:" + annotation.value());
			}
		}
	}
