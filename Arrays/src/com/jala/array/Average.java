package com.jala.array;

public class Average
{
	public static void findAvg(int[] arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum/arr.length);
	}
	public static void main(String[] args) 
	{
		int[] arr= {15,12,10,12,20};
		findAvg(arr);
	}

}
