package com.jala.strings;

public class RegularExpression {

	public static void main(String[] args)
	{
		String s2="This Is String Without Using New Key Word!!!";
		boolean res=s2.matches("(.*)ew(.*)");
		System.out.println(res);
		System.out.println(s2.matches("This(.*)"));
		System.out.println(s2.matches("(.*)!!!"));
	}

}
