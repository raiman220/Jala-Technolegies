package com.jala.array;

public class RemoveDuplicate
{
	public static void removeDuplicateElements(int[] arr)
	{  
		int ub=arr.length-1;
		int k=0;
		int[] arr1=new int[ub+1];
        for (int i = 0; i < ub; i++)
        {
			for (int j = 0; j < ub-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
       
        for(int i=0;i< ub;i++)
        {
        	if(arr[i]==arr[i+1])
        	{
        		
        	}
        	else
        	{
        		arr1[k++]=arr[i];
        	}
        }
        arr1[k]=arr[ub];
        for (int i = 0; i <= k; i++)
        {
			System.out.print(arr1[i]+ " ");
		}
    }  
       
    public static void main (String[] args)
    {  
        int arr[] = {56,45,84,25,16,02,100,25,84,45};  
        removeDuplicateElements(arr);
    }  
}


