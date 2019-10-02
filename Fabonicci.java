package com.tb.practice;

import java.util.Scanner;

public class Fabonicci {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,ne;
		
	
		System.out.println("Enter Number of elemnets in fabonicci series");
		Scanner sc=new Scanner(System.in);
		ne= sc.nextInt();
		System.out.println("value of input is:" +ne);
		System.out.print(n1+" "+n2);
		
		while(ne>0)
		{
			n3=n1+n2;
			System.out.print(n3);
			n1=n2;
			n2=n3;
			ne--;
		}

	}

}
