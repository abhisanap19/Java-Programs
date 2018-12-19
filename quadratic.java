package com.bridgelabz.functionprograms;

import java.util.Scanner;

import com.utility.Utility;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a=s.nextInt();
		System.out.println("Enter value of b: ");
		int b=s.nextInt();
		System.out.println("Enter value of c: ");
		int c=s.nextInt();
		
		Utility.solveDelta(a,b,c);
		
		
		
		
		
		

	}

}
