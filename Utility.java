package com.utility;
import java.util.Scanner;


public class Utility
{
	
	static Scanner sc=new Scanner(System.in);

	/**
	 * Aim: User Input and Replace String Template “Hello <<UserName>>, How are you?
	 *@author abhijeet sanap
	 *@version 1.0 
	 *@since 15-12-2018
	*/
	public static void getreplace()
	{
	
	String str1, str2, str3, str4;
	//String name=sc.nextLine();
	
	System.out.println("Enter String: ");
	str1 = sc.nextLine();

	System.out.println("Enter name you want to replace: ");
	str2 = sc.nextLine();
	System.out.println("Enter name you want to replace with: ");
	str3 = sc.nextLine();
	str4 = str1.replace(str2, str3);
    System.out.println("updated String: " + str4);
	
}
	
	/**
	 * Aim: Flip Coin and print percentage of Heads and Tails.
	 *@author abhijeet sanap
	 *@version 1.0 
	 *@since 15-12-2018
	*/
	
	 public static void flipcoin() {
		
		
		//flipcoin test = new flipcoin();
		int choice;	   
		//System.out.println("Welcome to the coin flip game!");

		do
		{
			System.out.println("Enter '1' to Flip Coin OR Enter '0' to Quit: ");
			Utility u=new Utility();
			choice = u.inputInteger();

			if (choice == 1)
			{
			//	sc.flip();
			}
			else if (choice > 1)
			{
				System.out.println("Invalid entry - please enter 1 or 0: ");
				choice = u.inputInteger();
			}
		}
while (choice != 0);
	}
	
	
	
	
	
	
	
	
	private int inputInteger() {
		// TODO Auto-generated method stub
		return 0;
	}  */

	/**
	 * Aim: Find whether the given year is Leap Year or not.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 15-12-2018
	*/
	public static void getleapyear() {
		 
		System.out.println("Enter any year: ");
		 int year=sc.nextInt();
		 
		 if((year%4==0 && year%100!=0)||(year%400==0)){
			 
			 System.out.println("This is a leap year");

		 }
		 else
		 {
			 System.out.println("Not a leap year");
		 }
		 
		
	}
	
	/**
	 * Aim: prints a table of the powers of 2 that are less than or equal to 2^N.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 15-12-2018
	*/

	public static void getpowerof() {
		// TODO Auto-generated method stub
		//String[] args = null;
		System.out.println("power value N: ");
		int n=sc.nextInt();
		
		
		
		
		int i=0;
		int powerOfTwo =1;
		
		while(i<=n) {
			
			
			System.out.println(""+powerOfTwo);
			powerOfTwo=2*powerOfTwo;
			i=i+1;
			
			
		
	}
	
}
	
	/**
	 * Aim: print Nth harmonic number.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 15-12-2018
	*/

	public static void getharmonicnum() {
		// TODO Auto-generated method stub
		System.out.println("Enter value of N: ");
			int n = sc.nextInt();
		      double sum = 0.0;
		      for (int i = 1; i <= n; i++){
		          sum += 1.0 / i;
		      }

		      
		      System.out.println(sum);
		
	}

}
	
	
	
	
