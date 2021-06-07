package com.jala.loop;

public class MultipleIfElse
{

	public static void main(String[] args)
	{
		int n1=32,n2=423,n3=2;

        if(n1 >= n2)
        {
            if(n1 >= n3)
            {
                System.out.println(n1 + " is the largest number.");
            }
            else
            {
                System.out.println(n3 + " is the largest number.");
            }
        }
        else
        {
            if(n2 >= n3)
            {
                System.out.println(n2 + " is the largest number.");
            }
            else
            {
                System.out.println(n3 + " is the largest number.");
            }
        }
	}

}
