package assigment;

class member {
	String name;
	int age;
	String phonenumber;
	String address;
	double salary;
	
	public member(String name, int age, String phonenumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.address = address;
		this.salary = salary;
	}
	
	public void printsalary() {
		System.out.println("Salary of "+name+ " is: "+salary);
	}
}

public class memberclass {
	public static void main(String[] args) {
		member m1 = new member("S", 20, "1234567890", "gujarat", 50000);
		member m2 = new member("R", 22, "1234567890", "gujarat", 60000);
		
		m1.printsalary();
		m2.printsalary();
	}

}
