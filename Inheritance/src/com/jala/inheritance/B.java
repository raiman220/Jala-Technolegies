package com.jala.inheritance;

public class B extends A
{
	private int x=50;
	public void firstMethodB()
	{
		System.out.println("This Is First Method Is Specific To B Class!!!");
	}
	public void secondMethodB()
	{
		System.out.println("This Is Second Method Is Specific To B Class!!!");
	}
	@Override
	public void run()
	{
		System.out.println("This Is Overriden Method Of Class A To B");
	}
	public int getX() {
		return x;
	}	
}
