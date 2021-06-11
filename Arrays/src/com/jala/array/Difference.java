package com.jala.array;

public class Difference
{
	public static void diffLargeSmall(int[] arr)
	{
		int min=999,max=0;
		for (int i = 0; i <=arr.length-1; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("Minimum :"+min +" Maximum :"+max);
		System.out.println("Differnce Between Large Number And Smaller Number is: "+(max-min));
	}
	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65};
		diffLargeSmall(arr);
	}

}
