package com.bridgelabz.functionprograms;
import java.util.Scanner;

//import java.util.Scanner;
import com.utility.Utility;

public class Coupon {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);

			//long number=Long.parseLong(args[0]);
			int result=s.nextInt();
			Utility.getCoupon(result);
			System.out.println(result);
	}

}
