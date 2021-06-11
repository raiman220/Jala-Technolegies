package com.jala.array;

public class SecondLarge
{
	public static void secLarge(int[] arr)
	{  
		int ub=arr.length-1;
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
        for (int i = 0; i < arr.length; i++)
        {
			System.out.print(arr[i]+ " ");
		}
        System.out.println();
        for (int i = arr.length-2; i >=0 ; i--)
        {
        	if(arr[i]!=arr[arr.length-1])
        	{
        		System.out.println("The Second Largest Is :"+arr[i]);
        		break;
        	}
		}
    }  
	public static void main(String[] args) 
	{
		int arr[] = {56,45,84,25,16,02,100,25,84,45};  
        secLarge(arr);
	}

}
