package com.bridgelabz.functionprograms;
import com.utility.Utility;
import java.util.Scanner;
public class Primefactor {
	
	public static void main(String[] args)
	{
		 Scanner s=new Scanner(System.in);

		//long number=Long.parseLong(args[0]);
		System.out.println("Enter a number");
		int number=s.nextInt();
		Utility.getprimefactor(number);

	

}
}