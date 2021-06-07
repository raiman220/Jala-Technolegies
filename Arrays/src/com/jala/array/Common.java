package com.jala.array;

public class Common
{
	public static void commonValue(int[] arr,int[] arr1)
	{

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr1.length; j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}

	}
	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65,10,54};
		int[] arr1= {55,20,25,02,65,50,25};
		commonValue(arr,arr1);
	}

}
