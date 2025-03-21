package controlstatment;

import java.util.Scanner;

public class fibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.println("Enter number");
		int n= number.nextInt();
		int n1 =0;
		int n2= 1;
		for(int i=0;i<n;i++)
		{
			int n3 = n1+n2;
			System.out.print(n1+" ");
			n1= n2;
			n2=n3;
		}

	}

}
