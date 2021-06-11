package com.jala.first;

public class FirstExample
{
	private int x=10;
	private void showX()
	{
		System.out.println("X :"+x);
	}
	public static void main(String[] args)
	{
		FirstExample f1=new FirstExample();
		System.out.println("X :"+f1.x);
		f1.showX();	
		Sample s1=new Sample();
			s1.run();
	}
}
