package com.jala.operator;

public class IncDec
{
	public static void increment(int x, int y)
	{
		int r1=0,r2=0;
		//Post Increment
		System.out.println("Before Increment :"+x);
		r1=10 + x++;
		System.out.println("r1 :"+r1);
		System.out.println("After Increment :"+x);
		System.out.println("---------------------");
		//Pre Increment
		System.out.println("Before Increment :"+x);
		r2=10 + ++x;
		System.out.println("r2 :"+r2);
		System.out.println("After Increment :"+x);
	}
	public static void decrement(int x,int y)
	{
		int r1=0,r2=0;
		//Post decrement
		System.out.println("Before decrement :"+x);
		r1=10 + x--;
		System.out.println("r1 :"+r1);
		System.out.println("After decrement :"+x);
		System.out.println("---------------------");
		//Pre Increment
		System.out.println("Before decrement :"+x);
		r2=10 + --x;
		System.out.println("r2 :"+r2);
		System.out.println("After decrement :"+x);
	}
	public static void main(String[] args)
	{
		increment(10,10);
		decrement(10,10);
	}

}
