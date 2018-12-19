package com.bridgelabz.functionprograms;

import java.util.Scanner;

import com.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		 //String str="ABCD";
		int n=str.length();
		//Permutation p=new Permutation();
		Utility.getPermute(str, 0, n-1);

	}



}
