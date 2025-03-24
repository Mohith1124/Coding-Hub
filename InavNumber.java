package com.packages;

public class InavNumber {
	int count=0,sum=0;
   public int countDigits(int n)
    {
	  int temp=n;
      if(n<9)
    	  return 1;
     while(temp!=0)
     {
    	 count++;
    	 temp=temp/10;
     }
     return count;
    }
   public int checkInav(int n)
   {
     while(n!=0) //92//11
     {
    	int last = n%10;
    	sum +=last;//11//2
    	n = n/10;
     }
     if(sum<9)
    	 return sum;
     else
     {
    	 n=sum;
    	 sum=0;
    	checkInav(n);
     }  
   return sum;
    }
public static void main(String[] args)
{
	int n=19919;
	InavNumber obj = new InavNumber();
	System.out.println(obj.checkInav(n)==1?"Inav Number":"Not an Inav Number");
}
}
