package com.jala.strings;

public class EqualIgnore {

	public static void main(String[] args)
	{
		
		String s1="Raiman";
		String s2="Raiman";
		String s3="raiman";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("R"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}

}
