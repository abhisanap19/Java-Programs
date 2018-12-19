package com.bridgelabz.functionprograms;

import java.util.Scanner;

import com.utility.Utility;

public class StopWatch {
	
	long startTime=0;
	long stopTime=0;
	long elapse;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		//StopWatch sw=new StopWatch();
		//Utility u=new Utility();
		System.out.println("Press '1' to Start Time: ");
		int startTime=s.nextInt();
		Utility.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		int stopTime=s.nextInt();
		Utility.stop();
		
		System.out.println("Press '3' to elapse Time: ");
		int elapse=s.nextInt();
		Utility.elapseTime();


		//long l=0;
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+Utility.elapseTime()+"ms");
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(Utility.elapseTime()/1000)+" sec");
		Utility.elapseTime();
}
	
	
	

}
