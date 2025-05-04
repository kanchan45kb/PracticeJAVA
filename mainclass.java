package oops_Methods;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass std = new subclass();
		std.student1(); // 1
		//int ag = std.age();
		//System.out.println(ag);
		System.out.println(std.age()); // 2
		std.salary(31000);//3
		String nam = std.surname("Maxwell"); //4
		System.out.println(nam);

	}

}
