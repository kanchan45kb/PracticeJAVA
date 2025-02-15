package practice.practice1;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical operators
	/*	boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		boolean b1 = 10 > 20;
		boolean b2 = 20 > 10;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		System.out.println(!b2);
		// Increament and Decreament operators
		int a = 12;
		int number1 = a++; // It store a = 12 in number1 and then increamented Post-increamented
		// int number2 = ++a; // It first increamented a and then store in number2
		// Pre-Increamentation
		System.out.println(number1);
		// System.out.println(number2);
		int b = 100;
		int sub1 = b--;
		System.out.println(sub1);
		int c = 200;
		int sub2 = --c;
		System.out.println(sub2);
		// Assignment Operators
		int m = 8;
		int n = 9;
		int p = 20;
		int o = 40;
		int l = 75;
		m += 10;
		n -= 7;
		p *= 4;
		o /= 5;
		l %= 7;
		System.out.println("New values of " + "m=" + m + ",n= " + n + ",p= " + p + ",o= " + o + ",l=" + l);
		// Conditional /Ternary operator
		int w = (1 == 2) ? 200 : 100;
		System.out.println(w);

		int age = 25;
		String personAge = (age <= 30) ? "Eligible for drive" : "Not Eligible for drive"; // var = exp ? result1:result2
																							// (exp= boolean)
		System.out.println(personAge); */
		// Assigment swapping of numbers
		//method 1 ---> only arithmatic operators using
		int h = 15;
		int j = 25;
		h = h+j;
		j=h-j;
		h = h-j;
		System.out.println(h);
		System.out.println(j);
		// Method 2 -----> Ternary operator
		int nu1 = (1==2)?15:25; // exp is False so it store 25 in nu1
		h= nu1;
		System.out.println("h ="+h);
		int nu2 = (1==1)?15:25; // exp is true so it store 15 in nu2
		j=nu2;
		System.out.println("j ="+j);

	}

}
