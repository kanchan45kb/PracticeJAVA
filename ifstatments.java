package controlstatment;

import java.util.Scanner;

public class ifstatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.print("Enter the number a = ");
		int a = number.nextInt();
		System.out.print("Enter the number b = ");
		int b = number.nextInt();
		System.out.print("Enter the number c = ");
		int c = number.nextInt();

		/*
		 * // number is even or Odd if(a%2==0) {
		 * System.out.println("Enter number is even"); } else {
		 * System.out.println("Enter number is odd"); }
		 */
		// Number Positive or Negative
		/*
		 * if (a > 0) { System.out.println("Number is Positive");
		 * 
		 * } else { System.out.println("Number is Negative"); }
		 */

		// largest number in 3 numbers

		if (a > b && a > c) {
			System.out.println("This number is greater " + a);
		} else if (b > a && b > c) {
			System.out.println("This number is greater " + b);
		} else {
			System.out.println("This number is greater " + c);
		}
	}
}
