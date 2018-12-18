package com.bridgelabz.functionprograms;

import java.util.Scanner;

import com.utility.Utility;

public class triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n=s.nextInt(); 
		int arr[]=new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		
		System.out.print("array eleaments are:\n");
		
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+"\t");
		}
		
		
		
		Utility.solveTriplets(arr, n); 
		
		

	}

}
