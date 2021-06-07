package com.jala.loop;

public class EvenSwitch
{

	public static void main(String[] args)
	{
		int number=12;    
	    switch(number%2) //this will return either 0 or 1
	    {
	        case 0:
	            System.out.println(number+":is an EVEN number");
	            break;
	        case 1:
	        	System.out.println(number+":is an ODD number");
	            break;
	    }
	     

	}

}
