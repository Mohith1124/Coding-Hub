package com.packages;

public class DualPrime {
     public boolean isPrime(int n)
	 {
		for(int i=2;i*i<=n;i++) 
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	 }
	 public int reverseNum(int n)
	 {
		int rev=0;
		while(n!=0)
		{
			int last = n%10;
			rev = rev*10+last;
			n = n/10;
		}
		return rev;
	 }

	public static void main(String[] args) {
		int n=13;
		DualPrime obj = new DualPrime();
		if(obj.isPrime(n) && obj.isPrime(obj.reverseNum(n)))
			System.out.println(n+ " is a Dual Prime");
		else
			System.out.println(n+ " not a Dual Prime");
      
	}

}
