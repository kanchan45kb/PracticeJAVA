package controlstatment;

import java.util.Scanner;

public class reversethenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = number.nextInt();
		int rem=0;
		while(a>0)
		{
			
			rev = a%10;
			rem = (rem*10)+rev;
			a = a/10;
		}
		System.out.println(rem);

	}
	}


