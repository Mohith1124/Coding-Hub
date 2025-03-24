package com.CodingHub;

public class ArmStrong {
	public int countDigits(int n)
	{
		int temp = n,count=0;
		while(temp!=0) 
		{
		  temp = temp/10;
		  count++;
		}
		return count;
	}
	public int calArm(int n,int count)
	{
		int sum=0,res=1;
		int temp = n;
		while(temp!=0) {
			int last = temp%10;
			res=1;
			for(int i=0;i<count;i++)
			{
				res*=last;
			}
			sum+=res;
			temp=temp/10;
		}
	   return sum;
	}
	public static void main(String[] args)
	{
		int n=371;
		ArmStrong obj = new ArmStrong();
		int count = obj.countDigits(n);
		int result = obj.calArm(n,count);
		if(result==n)
			System.out.println("Armstrong number");
		else
			System.out.println("Not");
	}
    
}
