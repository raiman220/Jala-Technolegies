package com.jala.loop;


public class GenderSwitch
{

	public static void main(String[] args)
	{
		
		char gender='M';    
	    switch(gender)
	    {
	        case 'M':
	            System.out.println("MALE");
	            break;
	        case 'F':
	        	System.out.println("FEMALE");
	            break;
	            default:System.err.println("Invalid Choice!!!!");
	    }
	}

}
