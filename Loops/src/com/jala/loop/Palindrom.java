package com.jala.loop;

public class Palindrom
{
	public static void palindromOrNot(int n)
	{
		int temp=n;
		int rev=0;
		while(n!=0)
		{
			int i=n%10;
			rev=rev*10+i;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("The Given Number Is Palindrom Number!!!");
		}
		else
		{
			System.out.println("The Given Number Is Not Palindrom Number!!!");
		}
	}
	public static void main(String[] args)
	{
		palindromOrNot(323);
	}

}
