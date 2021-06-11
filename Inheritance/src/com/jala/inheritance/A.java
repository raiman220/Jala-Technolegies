package com.jala.inheritance;

public class A 
{
	private int x=10;
	public void firstMethodA()
	{
		System.out.println("This Is First Method Is Specific To A Class!!!");
	}
	public void secondMethodA()
	{
		System.out.println("This Is Second Method Is Specific To A Class!!!");
	}
	public void run()
	{
		System.out.println("This Is Run Method Is to Override To all Sub Class!!!");
	}
	public int getX()
	{
		return x;
	}
}
