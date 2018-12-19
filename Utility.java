package com.utility;
import java.util.Arrays;
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
	 *@since 17-12-2018
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
	 *@since 17-12-2018
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
	 *@since 17-12-2018
	*/
	
	
	public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }

    
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  
        int count = 0;                           
        int distinct  = 0;                       

       
        while (distinct < n) {
            int value = getCoupon(n);           
            count++;                             
            if (!isCollected[value]) {           
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

	
	
	
	/**
	 * Aim:A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 * @return 
	 *@since 18-12-2018
	*/
	  
	
	public static void read2D(int[][] a,int M,int N){
		
		
	    System.out.println("Enter matrix data: ");
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				
				a[i][j]=sc.nextInt();
				
				
			}
		}
		
		//return a;		
		
	}
	
	
	
	
	public static void print(int[][] a,int M,int N) {
		
		System.out.println("Your matrix is: ");
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				
				System.out.print(a[i][j]+"\t");
						
			}
			
			System.out.println();
			
			
			
			
			
		}
		
		
		
		
	}

	
	/**
	 * Aim: A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 18-12-2018
	*/
	
	
	public static void solveTriplets(int[] arr,int n){
		
		boolean found =true;
		
		
		
		for(int i=0;i<n-2;i++) {
			
			
			for(int j=i+1;j<n-1;j++) {
				
				for(int k=j+1;k<n;k++) {
					
				if(	arr[i]+arr[j]+arr[k]==0) {
					System.out.println("Triplets are: "+arr[i]+"\t"+arr[j]+"\t"+arr[k]+"\t");
					found=true;
				}
				
				
					
					
					
				}
				
			}
		}
	
			
		if(found==false) {
			
			System.err.println("no triplets founds ");
			
			
		}
		
	}
	
	
	
	/**
	 * Aim: Write a program Distance.java that takes two integer command­line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 18-12-2018
	*/
	
	
	
	
	public static void euclidDist(double x,double y) {
		
		 double dist = Math.pow(((x*x)+(y*y)),0.5);
	     System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
		
		//return dist;
	}
	
	
	
	
	
	
	/**
	 * Aim:Permutation of string using iterartive and recursive method. 
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 19-12-2018
	*/
	
	
	public static void getPermute(String str,int fi,int la) {
		
		if(fi==la) {
			
			System.out.println(str);
			
		}
		
		else {
			
			for(int i=fi;i<=la;i++) {
				
				str=swap(str,fi,i);
				getPermute(str,fi+1,la);
				str=swap(str,fi,i);	
				
			}
			
			
		}
			
		
	}
	
	
	public static String swap(String str1,int i,int j) {
		
		
		char temp;
		
		char[] charArray=str1.toCharArray();
		
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
		
	}
	

	
	
	/**
	 * Aim: Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 19-12-2018
	*/
	public static long stopTime=0;
	public static long startTime=0;
	
	public static void start() {
		
		startTime=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
				
	}
	
	
	public static void stop() {
		
		stopTime=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTime);
				
	}
	
	

	public static long elapseTime() {
		long elapse;
		
		 elapse = stopTime-startTime;
		
		return elapse;
	}
	
	
	
	
	
	/**
	 * Aim: TicTacToe game.
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 19-12-2018
	*/
	static Scanner in;
	static String[] board;
	static String turn;

	public static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

	public static void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	public static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
	
	
	
	
	/**
	 * Aim: Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c..
	 *@author Abhijeet Sanap
	 *@version 1.0 
	 *@since 19-12-2018
	*/
	
	
	public static void solveDelta(double a,double b,double c) {
	
		
		double root1,root2;
		
		double delta= b*b-4*a*c;
		
		if(delta> 0)      //real and distinct
		{
            root1 = (-b + Math.sqrt(Math.abs(delta))) / (2 * a);
            root2 = (-b - Math.sqrt(Math.abs(delta))) / (2 * a);
		System.out.format("root1=%.2f and root2=%.2f",root1,root2);
 
     	}
		else if(delta==0)   //real and equal
		{
			
			root1=root2= -b/2*a;
			System.out.format("root1=root2=%.2f",root1);
		
		}
		
		else
		{
			double realp= -b/2*a;
			double imaginaryp= Math.sqrt(Math.abs(-delta))/(2*a);
			
			System.out.format("root1=%.2f+%.2fi and root2=%.2f-%.2f",realp,imaginaryp,realp,imaginaryp);
			
		}
		
		
		
	
	
}
	
	
}
	
