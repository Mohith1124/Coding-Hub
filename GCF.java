package com.CodingHub;

public class GCF {
	public int greatestCommonFactor(int n1,int n2)
	{   int gcf=0;
	    int n = (n1<n2)?n1:n2;
		for(int i=1;i<=n1;i++)
		{
			if(n%i==0)
			{
				gcf=i;
			}
		}
		return gcf;
	}
	public static void main(String[] args)
	{
		int n1=12,n2=24;
		GCF obj = new GCF();
		System.out.println(obj.greatestCommonFactor(n1,n2));
	}

}
