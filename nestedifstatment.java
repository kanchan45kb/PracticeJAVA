package controlstatment;

import java.util.Scanner;

public class nestedifstatment {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Enter the week number between 1 to 7 only = ");
		int a = number.nextInt();
		if (a == 1) {
			System.out.println("Day is Monday");
		} else if (a == 2) {
			System.out.println("Day is Tuesday");
		} else if (a == 3) {
			System.out.println("Day is Wednsday");
		} else if (a == 4) {
			System.out.println("Day is Thursday");
		} else if (a == 5) {
			System.out.println("Day is Friday");
		} else if (a == 6) {
			System.out.println("Day is Saturday");
		} else {
			System.out.println("Day is Sunday");
		}

	}

}
