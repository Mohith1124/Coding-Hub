package com.packages;

import java.util.Scanner;

public class AutomaticNumber {
    public boolean checkAutomatic(int n)
    {
    	int temp = n,count=0,Square = n * n;
    	while(temp!=0)
    	{
    		count++;
    		temp = temp/10;
    	}
    	
    	int last = Square % (int)Math.pow(10,count);
    	if(last==n)
    		return true;
    	else
    		return false;
    }
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    System.out.println("Enter n : ");
    	int n=sc.nextInt();
    	AutomaticNumber obj = new AutomaticNumber();
    	if(obj.checkAutomatic(n))
    		System.out.println("Automatic Number");
    	else
    		System.out.println("Not a Automatic Number");
    }
}
