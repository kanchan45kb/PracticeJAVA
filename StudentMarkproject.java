package controlstatment;

import java.util.Scanner;

public class StudentMarkproject {

	public static void main(String[] args) {
		while (1==1) {
			Scanner physics = new Scanner(System.in);
			System.out.println("Enter Physics marks");
			int a = physics.nextInt();
			Scanner chemistry = new Scanner(System.in);
			System.out.println("Enter Chemistry marks");
			int b = chemistry.nextInt();
			Scanner Maths = new Scanner(System.in);
			System.out.println("Enter Maths marks");
			int c = Maths.nextInt();
			if (a >= 50) {
				if (b >= 40) {
					if (c >= 60) {
						if (a + b + c >= 200) {
							System.out.println("Student is eligible for admission " + (a + b + c));
						}
					}
				}
			}

			else if (c + a >= 150) {
				System.out.println("Student is eligible for admission");
			} else {
				System.out.println("Student is not eligible for admission");
			}

		}

	}
}