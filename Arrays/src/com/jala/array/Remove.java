package com.jala.array;

public class Remove
{
	public static void removeElement(int[] arr,int item)
	{
		int index=0;
		int[] newarr=new int[arr.length-1];
		for(int i = 0; i <arr.length-1; i++)
	    {
	        if(arr[i] == item)
	        {
	            index = i;
	            break;
	        }
	    }
		for (int i = 0 , k=0; i < arr.length; i++)
		{
			if(i==index)
			{
				continue;
			}
			else
			{
				newarr[k++]=arr[i];
			
			}
		}
		for (int i = 0; i < newarr.length; i++)
		{
			System.out.print(newarr[i]+ " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65};
		removeElement(arr,10);
		
	}

}
