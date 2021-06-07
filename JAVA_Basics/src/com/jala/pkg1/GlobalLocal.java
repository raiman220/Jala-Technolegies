package com.jala.pkg1;

public class GlobalLocal 
{
	static int x=10;
	double y=20;	
	public static void main(String[] args) 
	{
		int x=30;
		double y=50;
		System.out.println("X:"+x);//Global and local variable with same name then always preference goes to local variable.
		System.out.println("X:"+GlobalLocal.x);/*to print global variable also if it global static variable then access global variable 
												using classname dot(.) and member. if global non static variable then use by object*/
		GlobalLocal obj1=new GlobalLocal();
		System.out.println("Y :"+y);
		System.out.println("Y :"+obj1.y);
	}

}
