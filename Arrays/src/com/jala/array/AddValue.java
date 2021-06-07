package com.jala.array;

import java.util.Scanner;

public class AddValue
{
	static Scanner sc=new Scanner(System.in);
	public static void addVal(int[] arr)
	{
		System.out.println("Enter:"+arr.length+" Numbers");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void displayArray(int[] arr)
	{
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		addVal(arr);
		displayArray(arr);
	}

}
