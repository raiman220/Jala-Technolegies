package com.jala.inheritance;

public class C extends B
{
	private int x=100;
	public void firstMethodC()
	{
		System.out.println("This Is First Method Is Specific To C Class!!!");
	}
	public void secondMethodC()
	{
		System.out.println("This Is Second Method Is Specific To C Class!!!");
	}
	@Override
	public void run()
	{
		System.out.println("This Is Overriden Method Of Class A To C");
	}
	public int getX()
	{
		return x;
	}
	
}
