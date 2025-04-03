package com.CodingHub;

public class MultipleMethods {
	public static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static boolean isPalindrome(int n)
	{
		int rev=0,temp=n;
		while(temp!=0)
		{
			int last = temp%10;
			rev = rev*10 + last;
			temp = temp/10;
		}
		if(n==rev)
			return true;
		return false;
	}
	public static boolean isArmStrong(int n)
	{
		int sum=0,temp=n,count=0,rem=0;
		while(temp!=0)
		{
			count++;
			temp = temp/10;
		}
		temp = n;
		while(temp!=0)
		{
			rem = temp%10;
			int power = (int) Math.pow(rem,count);
			sum += power;
			temp = temp/10;
		}
		if(sum==n)
			return true;
		return false;
	 }

	public static void main(String[] args) {
	 int a[] = {11,45,67,89,43,82,97,14,32,03};
	 for(int i:a)
	 {
		 if(isPrime(i))
			 System.out.println("Prime numbers present in the array are :"+i);
	 }
	 for(int i:a)
	 {
		 if(isPalindrome(i))
			 System.out.println("Palindrome numbers present in the array are :"+i);
	 }
	 for(int i:a)
	 {
		 if(isArmStrong(i))
			 System.out.println("ArmStrong numbers present in the array are :"+i);
	 }

	}

}
