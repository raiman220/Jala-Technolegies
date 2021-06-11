package com.jala.statics;

public class First
{
	static int x=10;
	static int y=20;
	int m=40;
	int n=30;
	public static void firstStaticMethod()
	{
		System.out.println("This Is First Static Method!!!");
		First f1=new First();
		System.out.println("M :"+f1.m);
		System.out.println("N :"+f1.n);
	}
	public static void SecondStaticMethod()
	{
		System.out.println("This Is Second Static Method!!!");
		First f1=new First();
		f1.firstInstanceMethod();
	}
	public  void firstInstanceMethod()
	{
		System.out.println("This Is First Instance Method!!!");
		System.out.println("X :"+x);
		System.out.println("Y :"+y);

	}
	public  void SecondInstanceMethod()
	{
		System.out.println("This Is First Instance Method!!!");
		firstStaticMethod();
	}
	public static void main(String[] args)
	{
		

		First f1=new First();
		System.out.println("Static Variables : X:"+x+" Y:"+y);
		System.out.println("Instance Variables : M:"+f1.m+" N:"+f1.n);
		firstStaticMethod();
		f1.firstInstanceMethod();

	}

}
