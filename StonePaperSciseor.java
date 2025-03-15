package game;

import java.util.Random;
import java.util.Scanner;

public class StonePaperSciseor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner(System.in);
		int rock,paper,scisor;
		rock =0;
		paper =1;
		scisor =2;
		System.out.println("rock=0, Paper=1, Scisor =2");
	System.out.println("User please enter your choice");
	int number = UserInput.nextInt();
	//System.out.println("\n");
	
	Random rnd = new Random();
	System.out.println("-----------------------------------------------");
		while(number >2)
		{
			if(number>2)
			{
				System.out.println("Its invalid choice");
			}
			break;
		}
		if(number ==rock)
		{
			System.out.println("User enter Rock");
		}
		if(number==paper) {
			System.out.println("User Enter Paper");
		}
		else if(number==scisor) {
			System.out.println("User Enter Scisor");
		}

		int computer = rnd.nextInt(3);
		if(computer ==rock)
		{
			System.out.println("computer enter Rock");
		}
		if(computer==paper) {
			System.out.println("computer Enter Paper");
		}
		else if(computer==scisor) {
			System.out.println("computer Enter Scisor");
		}
		
		if(number==computer)
		{
			System.out.println("Its draw");
		}
		if((number==rock)&&(computer==paper)) // -----1
		{
			System.out.println("Computer win");
		}
		if(number==paper && computer== rock) // ------2
		{
			System.out.println("User win");
		}
		if(number==scisor && computer==rock) //------3
		{
			System.out.println("Computer win");
		}
		if(number == rock && computer== scisor)//------4
		{
			System.out.println("User win");
		}
		if(number ==paper && computer == scisor) //-------5 
		{
			System.out.println("Computer win");
		}
		if(number==scisor && computer == paper) //------6
		{
			System.out.println("User win");
		}
	}
		

	

}
