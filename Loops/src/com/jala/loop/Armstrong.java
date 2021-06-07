package com.jala.loop;

public class Armstrong
{
	public static void findArmstrong(int n)
	{
		int temp=n;
		int arm=0;
		while(n!=0)
		{
			int i=n%10;
			arm=arm+(i*i*i);
			n=n/10;
		}
		if(temp==arm)
		{
			System.out.println("The Given Number Is Armstrong Number!!!");
		}
		else
		{
			System.out.println("The Given Number Is Not Armstrong Number!!!");
		}
	}
	public static void main(String[] args)
	{
		findArmstrong(371);
	}

}
