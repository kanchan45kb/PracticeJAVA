package controlstatment;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		//Scanner number = new Scanner(System.in);
		System.out.print("Enter the week number between 1 to 7 only = ");
	//	int a = number.nextInt();
		switch(number)
		{
		case 1: System.out.println("Monday");break; // break is use to jump out from case
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednsday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		case 7: System.out.println("Sunday");break;
		default: System.out.println("Invalid week number");
		
		}
		/*
		Scanner day = new Scanner(System.in);
		System.out.print("Enter the Day name = ");
		String a = day.next();
		switch(a)
		{
		case "Monday" : System.out.println("1");break;
		case "Tuesday": System.out.println("2");break;
		case "Wednsday" : System.out.println("3");break;
		case "Thursday" : System.out.println("4");break;
		case "Friday" : System.out.println("5");break;
		case "Saturday" : System.out.println("6");break;
		case "Sunday" : System.out.println("7");break;
		default:System.out.println("Invalid Day from week");
		
		}*/
		
	}

}
