package oops_Methods;

public class subclass {
	void student1(){ // 1. No Parameter - No return
		System.out.println("My name is Johan");
		
	}
	
	int age() { // 2. No parameter-Return value
		return 31;
	}
	
	void salary(int a) { //3. Parameter - No return value
		System.out.println("He has salary " + a );
	}
	String surname(String name) { //4. Parameter value - Return value
		return("Johan surname is "+name);
	}

}
