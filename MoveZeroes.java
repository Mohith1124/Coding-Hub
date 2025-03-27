package com.CodingHub;

public class Array10 {
	public static int[] moveZeroesToEnd(int a[]) 
    {
     int j = 0;
     for (int i=0;i<a.length;i++)
     {
	   if(a[i]!=0) 
	   {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		j++;
	   }
     }
     return a;
    }
public static void main(String[] args) {
	int a[] = {12,0,34,56,0,0,76,42,0};
	moveZeroesToEnd(a);
	System.out.println("The array after moving zeroes to the end :");
	for(int i=0;i<a.length;i++)
	{
	 System.out.print(a[i]+" ");
	}
  }
}
