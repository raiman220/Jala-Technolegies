package com.jala.interfaces7;

public class Sample implements Demo,Demo1	
{

	@Override
	public void run() 
	{
		System.out.println("This Is Overriden Method Of Demo Interface");
	}

	@Override
	public void run1()
	{
		System.out.println("This Is Overriden Method Of Demo1 Interface");
		
	}
}
