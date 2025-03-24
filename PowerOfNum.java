package com.CodingHub;
import java.util.Scanner;
public class Power {
	public int pow(int n,int power)
	{
	  int res = 1;
	  while(power!=0) {
		  res = res*n;
		  power--;
	  }
	  return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		System.out.println("Enter Power :");
		int power = sc.nextInt();
        Power obj = new Power();
        int result = obj.pow(n,power);
        System.out.println(n +" Power " +power +" is : "+result);
	}

}
