package javanew.Sample;

import java.lang.reflect.Method;

class Sample {
	//適当なメソッドを持つSampleクラスを作成
	public void sayHello() {
	}

	public void secretMethod() {

	}

	public int calculate(int a) {
		return a;
	}
}

public class ReflectionAnnotation1 {
	public static void main(String[] args) {
		//Sampleクラスのクラス情報を取得
		Class<Sample> clazz = Sample.class;
		
		//クラスに定義されている全メソッドを取得
		Method[] methods = clazz.getDeclaredMethods();
		
		//メソッド名をループで表示
		System.out.println("Sampleクラスのメソッド一覧:");
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
