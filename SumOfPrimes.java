package com.CodingHub;

public class CheckPrime {
	public int primeOrNot(int n)
	{
	  int sum=0;
	  for(int i=2;i<=n;i++)
	  {
	   boolean isPrime = true;
	   for(int j=2;j*j<=i;j++)
	   {
		   if(i%j==0) {
			   isPrime=false;
		       break;
		   }
	   }
	  
	  if(isPrime)
	       sum+=i;
	}
	  return sum;
	}


public static void main(String[] args) {
		int n=21;
		CheckPrime obj = new CheckPrime();
		System.out.println(obj.primeOrNot(n));
		
	}
}


