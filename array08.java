package arrayspractice;

import java.util.Scanner;

public class array08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array lenght");
		Scanner scr = new Scanner(System.in);
		int l = scr.nextInt();
		int[] arry= new int[l];
		System.out.println("Enter array elements");
		
		
		for(int i =0;i<l;i++) {
			arry[i]=scr.nextInt();				
		}
        
         System.out.print("|");
         for(int m:arry) {
        	 System.out.print(m+" ");
         }
         System.out.println("|");
        int max = arry[0];
        for(int n=0;n<l;n++) {
         if(arry[n]>max) {
        	  max=arry[n];      
        	          }
         }
        System.out.println("Largest number in Array :" +max);
         
         
         
	}
	

}
