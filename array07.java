package arrayspractice;

import java.util.Scanner;

public class array07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scr = new Scanner(System.in);
		System.out.println("Eneter lenght of Array");
		int l =scr.nextInt();		
		int[] arry1 = new int[l];
        System.out.println("Enter "+l+" numbers in array");
		for(int i =0;i<l;i++)
		{
			arry1[i] = scr.nextInt();
		}
		System.out.print("{");
		for(int m:arry1) {
		System.out.print(m);
		System.out.print(" ");
		}
		System.out.println("}");
		for(int n:arry1)
		{
			if(n%2==0)
			{
				System.out.println("Number is even "+n);
			}
			else {
				System.out.println("Number is odd "+n);
			}
		}
		}
		
			

	}


