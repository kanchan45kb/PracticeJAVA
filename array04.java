package arrayspractice;

import java.util.Scanner;

public class array04 {

	public static void main(String[] args) {
		int a[]= {100,37,9281,783,200,03,839,829 };
		int element = 839;
		boolean status = false;
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Element is found");
				status=true;
			    break;	
			}
		}
			if(status==false)
			{
				System.out.println("Element is not found");
			}*/
		
		for(int x:a)
		{
			if (x==element)
			{
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		
		if(status==false)
		{
			System.out.println("Element not found");
		}

		// Count repeating element in array element
		int m[]= {100,212,100,100,200,210,310,100,212,210};
		int count =0;
		int elm =100;
		for(int y:m)
		{
			if(y==elm)
			{
				count++;
				
			}
		}
		System.out.println(elm+" are in array "+count+" times");
	}

}	
	
