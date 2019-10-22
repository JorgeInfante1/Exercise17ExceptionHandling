package com.exercise17exceptionhandling.app;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MyExceptions 
{

	public static void main(String[] args) 
	{
		int[] v= {1,2,3,4,5,6,7,8,9,10};
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
	    int number1=0;
	    Scanner input=new Scanner(System.in);
	    try 
	    {
	    	
	    	System.out.println("Element 1 is: "+v[0]);
	    	System.out.println("Element 2 is: "+v[1]);
	    	System.out.println("Element 3 is: "+v[2]);
	    	System.out.println("Element 4 is: "+v[3]);
	    	System.out.println("Element 5 is: "+v[4]);
	    	System.out.println("Element 6 is: "+v[5]);
	    	System.out.println("Element 7 is: "+v[6]);
	    	System.out.println("Element 8 is: "+v[7]);
	    	System.out.println("Element 9 is: "+v[8]);
	    	System.out.println("Element 10 is: "+v[9]);
	    	//System.out.println("Element 11 is: "+v[10]);//Exception
	    	System.out.println("Element 1 is: "+v[0]);
	    	System.out.println("Element 2 is: "+v[1]);
	    	System.out.println("Element 3 is: "+v[2]);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("Hey, be careful. You aren't directing to a valid index");
	    }
	    finally
	    {
	    	System.out.println("This finally statement will be executed anyway");
	    }
	    
	    for(int i=0;i<10;i++)
	    {
	    	try
	    	{
	    		System.out.println("Input a number between 0-10: ");
	    		numbers[i]=input.nextInt();
	    	}
	    	catch(NumberFormatException e)
	    	{
	    		System.out.println("Hey, the number you input is wrong. Do it again ");
	    		input.next();// Cleaning Buffer
	    		i--;
	    	}
	    	catch(InputMismatchException e)
	    	{
	    		System.out.println("Hey, the number you input is wrong. Do it again ");
	    		input.next();// Cleaning Buffer
	    		i--;
	    	}
	    	
	    	finally 
	    	
	    	{
	    		//input.next();
	    	}
	    	
	    }
	}

}
