package com.CodingHub;

import java.util.Arrays;

public class SecondMostRepeatedChar 
{

	public static void main(String[] args) 
	{
		String s = "hellloooo";
		char secondMostRepeatedChar = ' ',mostRepeatedChar=' '; 
		int mostCharCount =0,secondMostCharCount=0;
		char str[] = s.toCharArray();
		Arrays.sort(str);
		int count = 1; //e h l l l o o
		for(int i=1;i<str.length;i++)
		{   
		 if(str[i]==str[i-1])
			 count++;
		 else
		 {
		  if(count>mostCharCount)
		  {
				 secondMostCharCount = mostCharCount;
				 secondMostRepeatedChar = mostRepeatedChar;
				 mostCharCount = count;
				 mostRepeatedChar = str[i-1];
		   }
		 else if(count>secondMostCharCount && count!=mostCharCount)
		 {
			 secondMostCharCount = count;
		     secondMostRepeatedChar = str[i-1];
		 }
		  count = 1;
		 }
		}
		if(count>mostCharCount)
		 {   
			 secondMostCharCount = mostCharCount;
			 secondMostRepeatedChar = mostRepeatedChar;
			 mostCharCount = count; 
			 mostRepeatedChar = str[str.length-1];

		 }
		else if(count>secondMostCharCount && count!=mostCharCount)
		{
			 secondMostCharCount = count;
		     secondMostRepeatedChar = str[str.length-1];
		}
		System.out.println(mostCharCount);
		System.out.println(secondMostCharCount);
		System.out.println(secondMostRepeatedChar);
		
     }
}
