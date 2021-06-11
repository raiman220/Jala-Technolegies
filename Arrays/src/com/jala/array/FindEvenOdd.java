package com.jala.array;

public class FindEvenOdd
{
	public static void noEvenOdd(int[] arr)
	{  
		int even=0,odd=0;
		int ub=arr.length-1;
        for (int i = 0; i <= ub; i++)
        {
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
        }
        System.out.println("Even Number : "+ even + " Odd Number :"+ odd);
    }  
	public static void main(String[] args)
	{
		int arr[] = {56,45,84,25,16,02,100,25,84,45};  
        noEvenOdd(arr);
	}

}
