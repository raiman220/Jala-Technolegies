package com.jala.strings;

public class Replacing {

	public static void main(String[] args)
	{
		String s1="Raiman";
		System.out.println(s1);
		String s2=s1.replace('m','M');
		System.out.println(s2);
		String s3="Hey Jala Technology Hey Jala";
		String s4=s3.replaceAll("ch","Java");
		System.out.println(s4);
		String s5=s3.replaceFirst("Technology", "replacement");
		System.out.println(s5);
		String s6=s3.replace("ch", "Hello");
		System.out.println(s6);
	}

}
