package com.jala.array;

public class Duplicate
{
	public static void duplicateValue(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int n=arr[i];
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[j]==n)
				{
					System.out.println(arr[j]+" ");
					break;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65,10,25};
		duplicateValue(arr);
	}

}
