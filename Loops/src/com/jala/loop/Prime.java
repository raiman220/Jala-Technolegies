package com.jala.loop;

public class Prime
{
	public static void primeNum(int x)
	{
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The Given Number Is Prime!!!");
		}
		else
		{
			System.out.println("The Given Number Is Not Prime!!!");
		}
	}
	public static void main(String[] args)
	{
		primeNum(13);
	}

}
