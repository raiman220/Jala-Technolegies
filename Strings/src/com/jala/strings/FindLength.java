package com.jala.strings;

public class FindLength
{

	public static void main(String[] args)
	{
		String s1="Good";
		int length=0;
		char[] strCharArray=s1.toCharArray();
		for(char c:strCharArray)
		{
		  length++;
		}
		System.out.println(length);
	}

}
