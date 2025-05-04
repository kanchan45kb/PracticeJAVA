package encapsulation01;

public class employeemain {

	public static void main(String[] args) {
		employeevariable emp = new employeevariable();
	     emp.setAge(32);
	 //    System.out.println(emp.getAge());
	     emp.setName("Jonathan");
	  //   System.out.println(emp.getName());
		emp.setSalary(25000);
	//	System.out.println(emp.getSalary());
		emp.setGender(true);
	//	System.out.println("Does is Male? "+ emp.isGender());
		System.out.println(+emp.getAge() +" "+emp.getName()+" is Male candidate = "+emp.isGender()+" has salary = " +emp.getSalary());

	}

}
