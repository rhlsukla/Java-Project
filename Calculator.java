package com.tb.practice;

import java.util.Scanner;

public class Calculator {

	
		public static void main(String[] args) {
			
			int n,a,b,c,d,e,f,g;
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter value of a:");
			a=sc.nextInt();
			System.out.println("ENter value of b:");
			b=sc.nextInt();
			System.out.println("select the operation you want to perform");
			System.out.println("\n1.Addition\2.Subtraction\3.Multiply\4.Division\5.Modulus");
			
			n= sc.nextInt();
			switch(n)
			{
				case 1:
				{
					c=a+b;
					System.out.println("Addition is :"+c);
					break;
				}
				case 2:
				{
					if(a>b)
					{
					d=a-b;
					}
					else
					{
					d=b-a;
					}
					System.out.println("Addition is :"+d);
					break;
				}
				case 3:
				{
					e=a*b;
					System.out.println("Multiplication is :"+e);
					break;
				}
				case 4:
				{
					f=a/b;
					System.out.println("Division is :"+f);	
					break;
				}
				case 5:
				{
					g=a%b;
					System.out.println("modulus is :"+g);
					break;
				}
								
			}
			


		}
	
	
	
	}


