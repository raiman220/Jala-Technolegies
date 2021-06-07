package com.jala.array;

public class Insert
{
	public static void insertElement(int[] arr,int pos,int item)
	{
		
		int[] newarr=new int[arr.length+1];
		for (int i = 0; i <=arr.length; i++)
		{
			if(i<pos)
			{
				newarr[i]=arr[i];
			}
			else if(pos==i)
			{
				newarr[i]=item;
			}
			else
			{
				newarr[i]=arr[i-1];
			}
		}
		for (int i = 0; i <=newarr.length-1; i++)
		{
			System.out.print(newarr[i]+ " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65};
		insertElement(arr,2,108);
	}

}
