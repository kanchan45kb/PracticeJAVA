package constructor;

public class employee {
	int code;
	String name;
	long salary;
	
	void employee1() {
		System.out.println(""+code+" "+name+" "+salary);
	}
	void employee2(int id,String nam,long sal) {
		code = id;
		name = nam;
		salary = sal;
	}
	employee(int id,String nam,long sal)
	// Default constructor
	{
		code = id;
		name = nam;
		salary = sal;
	}

}
