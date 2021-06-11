package com.jala.interfaces8;

public class Sample implements Demo	
{

	@Override
	public void run() 
	{
		System.out.println("This Is Overriden Method Of Demo Interface");
		System.out.println("X :"+x+" Y :"+y);
	}
	
}
