package com.jala.array;

public class ReverseArray
{
	
	public static void reverse(int[] arr)
	{
		int[] newarr=new int[arr.length];
		for (int i = arr.length-1,k=0; i>=0 ; i--,k++)
		{
			newarr[k]=arr[i];
		}
		for (int i = 0; i <=newarr.length-1; i++)
		{
			System.out.print(newarr[i]+ " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65};
		reverse(arr);
	}

}
