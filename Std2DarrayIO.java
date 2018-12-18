package com.bridgelabz.functionprograms;
import java.util.Scanner;
import com.utility.Utility;

public class Std2DarrayIO {

	public static void main(String[] args) {
		
		
	   Scanner s=new Scanner(System.in);
	   
	   
	   System.out.println("Enter no. of rows and columns: ");
	   
	   int M=s.nextInt();
	   int N=s.nextInt();
	   
	   int a[][]=new int[M][N];
	   Utility.read2D(a,M,N);
	   Utility.print(a,M,N);
	   
	   
	   
		   
	   }

	}

	

