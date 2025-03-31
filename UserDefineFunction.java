package oopsConcept;

public class UserDefineFunction {
	/*
	    1.Without Parameters and Without Return Type
        2.Without Parameters but With Return Type
        3.With Parameters and Without Return Type
        4. With Parameters and With Return Type
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student info = new Student();
		info.name(); // without parameter and without return type
		//info.age();
		int agenumber = info.age(); // without parameter and with return type
		System.out.println(agenumber);
		info.details("Maths",90,100);  //with parameter and without return type
		int avg = info.avg(95,85); //with parameter and with return type
		System.out.println(avg);

	}

}
   class Student  {
	   String name;
	   int age;
   
	 void name() // without parameter and without return type
	 {
	  System.out.println("Will smith");	 
	 }
	static int age() // without parameter and with return type
	{
		int number = 14;
		System.out.print("Student age " );
		return number;
	}
	static void details(String subject,int mark,int outoff) //with parameter and without return type
	{
		System.out.println("Subject name: "+subject+" mark obtain "+mark+" Outoff "+outoff);
		
	}
	static int avg(int a, int b) //with parameter and with return type
	{
		int avarage = (a+b)/2;
		return avarage;
	}
	}
