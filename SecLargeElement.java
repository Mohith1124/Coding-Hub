package com.CodingHub;

public class SecLargeElement {
	public static int secondLargestElement(int a[])
	{
		int Largest = Integer.MIN_VALUE;
		int Second_Largest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>Largest)
			{   
				Second_Largest = Largest;
				Largest = a[i];
			}
			else if(a[i]>Second_Largest && a[i]<Largest)
				Second_Largest = a[i];
		}
		return (Second_Largest == Integer.MIN_VALUE) ? -1 : Second_Largest;
	}

	public static void main(String[] args) {
		int a[] = {0};
		System.out.println(secondLargestElement(a));

	}

}
