package com.packages;

import java.util.Scanner;

public class EvilNumber {
     public String FindEvil(int n)
     {
    	 int sum = 0;
    	 if(n==0)
    		 return "Enter Number Greater than Zero";
    	 else
    	 {
    		 int square = n * n;
    		 while(square!=0)
    		 {
    		 int last = square % 10;
    		 sum = sum + last;
    		 square = square / 10;
    		 }
    	 }
    	 if(sum==n)
    		 return "Evil Number";
    	 else
    		 return "Not an Evil Number";
     }
     public static void main(String[] args)
     {
    	 Scanner sc = new Scanner (System.in);
    	 System.out.println("Enter n : ");
    	 int n = sc.nextInt();
    	 EvilNumber obj = new EvilNumber();
    	 System.out.println(obj.FindEvil(n));
    	 
     }
}
