package javanew.Sample;

class Employee2 {
	String employeeId;
	String name;

	Employee2(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee2) {
			Employee2 other = (Employee2) obj;
			//社員IDが同じかどうか判定
			return this.employeeId.equals(other.employeeId);
		}
		return false;
	}
}

public class Employer1 {
	public static void main(String[] args) {
		//インスタンスを作成
		Employee2 emp1 = new Employee2("E001", "田中");
		Employee2 emp2 = new Employee2("E001", "佐藤"); // IDが同じ
		Employee2 emp3 = new Employee2("E002", "田中"); // IDが違う

		//equalsを使って比較
		System.out.println("emp1 と emp2 の比較: " + emp1.equals(emp2)); // true
		System.out.println("emp1 と emp3 の比較: " + emp1.equals(emp3)); // false
	}

}
