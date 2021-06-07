package com.jala.operator;

public class Arithmetic 
{
	public static void add(int x,int y)
	{
		System.out.println("Sum Of:"+ " X:"+x+" Y:"+y+" :"+(x+y));
	}
	public static void sub(int x,int y)
	{
		System.out.println("Substract Of:"+ "X:"+x+" Y"+y+" :"+(x-y));
	}
	public static void mul(int x,int y)
	{
		System.out.println("Multiplication Of:"+ " X:"+x+" Y:"+y+" :"+x*y);
	}
	public static void div(int x,int y)
	{
		System.out.println("Division Of:"+ "X:"+x+" Y"+y+" :"+x/y);
	}
	public static void main(String[] args) 
	{
		add(200,100);
		sub(200,100);
		mul(200,100);
		div(200,100);
	}

}
