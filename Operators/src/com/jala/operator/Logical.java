package com.jala.operator;

public class Logical
{

	public static void main(String[] args)
	{
		int x=10,y=50,c=30;
		System.out.println("Logical And");
		System.out.println(x>c && y>c); //Logical AND Operator
		System.out.println("Logical OR");
		System.out.println(x>c || y>c); //Logical OR Operator
		System.out.println("Logical NOT");
		System.out.println(!(x>c || y>c));
		System.out.println(!(x>c && y>c));
	}

}
