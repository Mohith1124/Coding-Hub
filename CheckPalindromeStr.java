package com.CodingHub;

public class CheckPalindromeStr {
	 public static boolean checkPal(String s)
	 {
	  String reverse ="";
	  for(int i=s.length()-1;i>=0;i--)
	  {
	    reverse+=s.charAt(i);
	  }
	  if(s.equals(reverse))
	  {
	      return true;
	  }
	  return false;
	}

	public static void main(String[] args)
	{
	   String s = "mom and dad";
	   String words[] = s.split(" ");
	   for(String st:words)
	   {
		if(checkPal(st))
		    System.out.println(st);
	   }
    }
	 }


