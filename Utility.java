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
		 
		 System.out.println("Enter no. of times u want to flip coin: ");
		 int n=sc.nextInt();
		 int head=0,tail=0;
		 
		 if(n>0){
			 double[] result=new double[n];
			 
			 for(int i=0;i<n;i++) {
				 
				 result[i]=Math.random();
				 
				 if(result[i]<0.5) {
					 
					 System.out.println("tails");
					 tail++;
					 
				 }
				 
				 else {
					 
					 System.out.println("heads");
					 head++;
					 
				 }
				 
				 
			 }	 
			 
		 
		 float percentageOfTail=(tail*100)/n;
		 System.out.println("percentageOfTail"+percentageOfTail);
		 
		 float percentageOfHead=(head*100)/n;
		 System.out.println("percentageOfHead"+percentageOfHead);
		
		 }
		 else {
			 System.err.println("Enter perfect no.");
			 
		 }
	}  

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
			
			
			System.out.println(i+"\t"+powerOfTwo);
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
		    	  
		    	 System.out.print("1/"+i+"+");
		    		  sum += 1.0 / i;  
		    		  
		    	  }
		     	
		    System.out.print(sum);  
		         
		
	}
	
	
	
	/**
	 * Aim: Find prime Factorization of given number.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 16-12-2018
	*/
	
	public static void getprimefactor(long number)
	{

		for(long i=2;i<=number/i;i++){
		System.out.println("{i="+i+",number="+number+" }");

		while(number%i==0){
		  number=number/i;
		   System.out.println("Factor: "+i);


		} 
		}

		 if(number>1){
		System.out.println("Factor: "+number);

		}


		System.out.println();




		}
	
	
	
	/**
	 * Aim: Simulates a gambler.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 16-12-2018
	*/
	
	public static void gambler() {
		
		System.out.println("Enter $stakes: ");
		int stake=sc.nextInt();
		
		System.out.println("Enter $goals: ");
		int goal=sc.nextInt();
		
		System.out.println("Enter no. of trials: ");
		int trial=sc.nextInt();
		
        int bets=0;
        int wins=0;
        int loss=0;
        
        for(int i=0;i<trial;i++) {
        	
        	int cash=stake;
        	
        	
        	while(cash>0 && cash<goal) {
        		
        		bets++;
        		
        		
        		if(Math.random()<0.5)
        			cash++;
        		else
        			cash--;
        			
        	}
        	
        	
        	
        	if(cash==goal) {
        		
        		wins++;
        		
        	}
        	
        	else
        		loss++;
        	
        	
        	
        }
        
        
        System.out.println(wins + " wins of " + trial);
        System.out.println("Percent of games won = " + 100.0 * wins / trial+"%");
        System.out.println(loss + " loss of " + trial);
        System.out.println("Percent of games loss = " + 100.0 * loss / trial+"%");
    }	
	
	
	/**
	 * Aim: Given N distinct Coupon Numbers, how many random numbers do you
need to generate distinct coupon number? This program simulates this random process.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 16-12-2018
	*/
	
	
	public static int getCoupon(int number) {
		boolean[] collected=new boolean[number];
		
		int iteration=0;
		int unique=0;
		
		while(unique<number) {
			
			int random=(int)(Math.random()*number);
			
			if(!collected[random]) {
				
				unique++;
				collected[random]=true;
				
				
			}
			iteration++;
			
		}		
		return iteration;
		
	}
	
}
	
	
	
	
