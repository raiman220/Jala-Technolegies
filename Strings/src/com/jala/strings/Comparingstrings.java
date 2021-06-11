package com.jala.strings;

public class Comparingstrings
{

	public static void main(String[] args)
	{
		String s1="Raiman";
		String s2=new String("Raiman");
		String s3=new String("raiman");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
