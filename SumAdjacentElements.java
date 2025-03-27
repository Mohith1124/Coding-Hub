package com.CodingHub;

public class Array12 {
	public static int[] sumOfElements(int a[])
	{   
		int b[] = new int[a.length],i=0;
		for(i=0;i<a.length;i++)
		{
		 if(i==0)
			 b[i]=a[i]+a[i+1];
		 else if(i==a.length-1)
			 b[i]=a[i]+a[i-1];
		 else
			 b[i]=a[i-1]+a[i+1];
		}
		
		return b;
	}

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[] = sumOfElements(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
