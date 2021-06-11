package com.jala.inheritance;

public class MainClass
{

	public static void main(String[] args)
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		System.out.println("Class A Start Execution!!!");
		a1.firstMethodA();
		a1.secondMethodA();
		a1.run();
		System.out.println("Class B Start Execution!!!");
		b1.firstMethodB();
		b1.secondMethodB();
		b1.run();
		System.out.println("Class C Start Execution!!!");
		c1.firstMethodC();
		c1.secondMethodC();
		c1.run();
		System.out.println("Calling overridden method with super class reference to B and C class’s objects");
		A a2=new B();
		a2.run();
		A a3=new C();
		a3.run();
		System.out.println("Runtime Polymorphism with Data Members!!!");
		System.out.println("The Class A Value Of X:"+a1.getX());
		System.out.println("The Class B Value Of X:"+b1.getX());
		System.out.println("The Class C Value Of X:"+c1.getX());
	}

}
