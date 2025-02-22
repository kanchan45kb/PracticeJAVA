package arrayspractice;

import java.util.Scanner;

public class array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element");
		int r = sc.nextInt();
		int[] arr = new int[r];
		System.out.println("Enter elements of the array");
		for(int i =0;i<r;i++)
		{
			System.out.println("Enter element at position " +i);
			arr[i] =sc.nextInt();
		}
		System.out.println();
		System.out.print("{ ");
		for(int j=0;j<r;j++)
		{
			System.out.print(arr[j] +" ");
		}
		System.out.println("}");
	}

}
