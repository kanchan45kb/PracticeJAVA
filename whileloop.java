package controlstatment;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Enter number ");
		int a = number.nextInt();
		int i=1;
		while(i<=a)
		{
			if (i%2==0)
			{
				System.out.println(i+"Even");
			}
			else 
			{
				System.out.println(i+"Odd");
			}
			i++;
		}

	}

}
