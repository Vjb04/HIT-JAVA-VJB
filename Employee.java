package basic;

public class Employee {
	int empId;
	String empName;
	
	Employee(int id, String name) {
		this.empId = id;
		this.empName = name;
	}
	void info() {
		System.out.println("Id: " + empId + " Name: " + empName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee(11010, "Jai");
		Employee obj2 = new Employee(11011, "Balaji");
		obj1.info();
		obj2.info();

	}

}
