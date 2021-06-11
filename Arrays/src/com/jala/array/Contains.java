package com.jala.array;

public class Contains
{

	public static void contains12_13(int[] num,int n1,int n2)
	{
		int flag=0;
		for (int i = 0; i < num.length-1; i++)
		{
			if(num[i]==n1&&num[i+1]==n2)
			{
				System.out.println("Found!!");
				flag=1;
				break;
			}
		}
		if (flag==0)
		{
			System.err.println("Not Found!!!");
		}
	}
	public static void main(String[] args)
	{

	    int[] num = {1, 2, 3, 4, 5,12,3,12,23};
	    contains12_13(num,12,23);
	 }
}
