package javanew.Sample;

class Student3 {
	static String schoolName;

	void show() {
		System.out.println("学校の名前:" + schoolName);
	}
}

public class StaticFields2 {
	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		Student3 s3 = new Student3();
		Student3.schoolName = "A高校";
		Student3.schoolName = "B高校";
		Student3.schoolName = "C高校";


		
		s1.show();
		s2.show();
		s3.show();


	}

}
