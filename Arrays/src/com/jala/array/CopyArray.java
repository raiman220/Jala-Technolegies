package com.jala.array;

public class CopyArray
{
	public static void copy(int[] arr)
	{

		int[] newarr=new int[arr.length];
		for (int i = 0 ; i <= arr.length-1; i++)
		{
			
				newarr[i]=arr[i];

		}
		for (int i = 0; i <= newarr.length-1; i++)
		{
			System.out.print(newarr[i]+ " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65};
		copy(arr);
	}

}
