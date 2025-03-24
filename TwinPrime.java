package com.CodingHub;

import java.util.Scanner;
public class TwinPrime 
{
 public static boolean Prime(int n) {
	 for(int i=2;i*i<=n;i++) {
		 if(n%i==0) {
			 return false;
		 }
	 }
	 return true;
}
public static boolean checkDualPrime(int n) {
	 if(Prime(n) && Prime(n+2)) {
		  return true;
    }
   return false;
}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter n :");
	 int n=sc.nextInt();
	 
	 System.out.println(checkDualPrime(n));
}
}