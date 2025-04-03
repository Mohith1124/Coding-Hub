package com.CodingHub;
import java.util.Scanner;
public class SelectionSort {
	public static void selSort(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int smallest = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[smallest])
					smallest = j;
			}
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " +n+ " elements :");
        for(int i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        selSort(a,n);
        for(int i=0;i<n;i++)
        {
        	System.out.println(a[i]);
        }

	}

}
