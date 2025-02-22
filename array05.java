package arrayspractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array05 {

	public static void main(String[] args) {
		Scanner lenght = new Scanner(System.in);
		System.out.println("Enter lenght of Array");
		int l = lenght.nextInt();
		int a[]= new int[l];
		Scanner arr = new Scanner(System.in);
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter the value in array"+i+ ":");
			 a[i]= arr.nextInt();
		}
       System.out.println(Arrays.toString(a));
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
       for(int j=a.length-1;j>=0;j--)
       {
    	   System.out.println(a[j]);
       }

    	 
      
     
      }
       

}

