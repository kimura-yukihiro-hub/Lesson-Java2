package javanew.Sample;

class Employee {
	int id;
	String name;
	int salary;
	void raiseSalary(double percent) {
		if (percent > 0) {
			double raiseAmount = this.salary * (percent / 100);
			this.salary += raiseAmount;
			System.out.println(name + "さんの給与が" + percent + "%昇給しました。");
			System.out.println("現在の給与: " + this.salary + "円");
		} else {
			System.out.println("昇給率は0より大きい値を指定してください。");
		}
	}
}
public class Employer {
	public static void main (String[] args) {
		Employee employee = new Employee();
		
		//フィールドに値をセット
		employee.id = 100;
		employee.name = "田中太郎";
		employee.salary = 210000;
		
		//?%昇給させる
		employee.raiseSalary(4.0);
	}

}
