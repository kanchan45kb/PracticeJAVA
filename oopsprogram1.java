package oopsConcept;

import java.util.Scanner;


public class oopsprogram1 {   
	static void addition( int a,int b) {
		float add = a+b;
		System.out.println("Addition = "+add);
	}
	static void Substraction(int m,int n) {
		float sub = m-n;
	    System.out.println("Substraction = "+sub);
	}
	static void Multiplication(int c, int d) {
	  double mul = c*d;
	  System.out.println("Multiplication = "+mul);
	}
	static void Division(int l,int o)
	{
		float div = l/o;
		System.out.println("Division = "+div);
	}
	static void Modulas(int u,int v) {
		float mod = u%v;
		System.out.println("Modulus = "+mod);
	}
	static void Compare(int e,int f) {
		String greater =(e>f)? "First number is greater than second number":"Second number is greater than first number";
		System.out.println(greater);
	}
	static void palindromenumber(int g,int h)
	{   
		int add1 = g+h;
		int rev =0;	
		int rem = add1;
		while(add1>0)
		{
			rev = rev*10+add1%10;
			add1 = add1/10;			
		}
		if(rem==rev)
		{
	     System.out.println("Addition of two number is Palindrom");
		}
       else {
	System.out.println("Addition of two number is not Palindrom");
}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = Sc.nextInt();
		System.out.println("Enter Second number");
		int y = Sc.nextInt();
		System.out.println("Enter number between 0 to 6");
		int number = Sc.nextInt();
		switch(number)
		{
		case 0:	addition(x,y);break;
		case 1:Substraction(x,y);break;
		case 2:Multiplication(x,y);break;
		case 3:Division(x,y);break;
		case 4: Modulas(x,y);break;
		case 5 :Compare(x,y);break;
		case 6: palindromenumber(x,y);break;
		default :System.out.println("Invalid number entered");
	}
	}

}
