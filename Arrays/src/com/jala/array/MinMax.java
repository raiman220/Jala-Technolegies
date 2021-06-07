package com.jala.array;

public class MinMax
{
		public static void minMaxNum(int[] arr)
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
		}
		public static void main(String[] args)
		{
			int[] arr= {15,10,25,35,65};
			minMaxNum(arr);
		}
}
