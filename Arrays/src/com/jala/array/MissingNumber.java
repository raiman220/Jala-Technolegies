package com.jala.array;

public class MissingNumber
{
	public static void missingNum(int[] arr)
	{
		int n=arr.length;
		int index=0;
		int sum=n*(n+1)/2;
		int total=0;
		int miss=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==0)
			{
				index=i;
			}
			else
			{
				total+=arr[i];
			}
		}
		miss=sum-total;
		System.out.println(miss +" "+ index );
	}
	public static void main(String[] args)
	{
		int arr [] = {1,0,2,3,4,5,8,9,6,7,10,11,12,15,16,13};
		missingNum(arr);
	}

}
