package com.jala.array;

public class RemoveDuplicate
{
	public static void remove(int[] arr)
	{
		int flag=1;
		int j=0;
		int[] newarr=new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			/*int n=arr[i];
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[j]!=n)
				{
					flag=0;
				}
				else
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				newarr[i]=arr[i];
			}
			else
			{
				newarr[i]=arr[i+1];
			}*/
			if (arr[i] != arr[i + 1])
			{
				newarr[j++] = arr[i];
            }
        }
		newarr[j++] = arr[arr.length-1];
		
			for (int i = 0; i <=newarr.length-1; i++)
			{
				System.out.print(newarr[i]+ " ");
			}
	}
	public static void main(String[] args)
	{
		int[] arr= {15,10,25,35,65,10,25};
		remove(arr);
	}

}
