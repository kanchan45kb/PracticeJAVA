package controlstatment;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = number.nextInt();
		int rev = 0;
		int b = n;
		while (n > 0) {
			
			rev = (rev*10)+(n%10);
			n=n/10;
			
          
		}	
		System.out.println(rev);
			if(b==rev)
			{
				System.out.println("Number is palindromenormal");
			}
			else
			{
				System.out.println("Number is Normal ");
			}
		}
		
	}


