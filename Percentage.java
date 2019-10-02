package com.tb.practice;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
	int maths;
	int english;
	int science;
	int chemistry;
	int hindi;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of maths:");
	maths=sc.nextInt();
	System.out.println("Enter the marks of english:");
	english=sc.nextInt();
	System.out.println("Enter the marks of science:");
	science=sc.nextInt();
	System.out.println("Enter the marks of chemistry:");
	chemistry=sc.nextInt();
	System.out.println("Enter the marks of hindi:");
	hindi=sc.nextInt();
	int percentage=(maths+english+science+chemistry+hindi)/5;
	System.out.println("percentage is:"+percentage);
	switch(percentage)
	{
	case 1:
	}
	}

}
