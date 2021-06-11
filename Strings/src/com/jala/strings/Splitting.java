package com.jala.strings;

public class Splitting
{

	public static void main(String[] args)
	{
		String s1="Hey Jala Technology";
		String[] s2=s1.split("o");
		for(String s3:s2)
		{
			System.out.println(s3);
		}
		String[] s3=s1.split("o",2);
		for(String s4:s3)
		{
			System.out.println(s4);
		}
	}

}