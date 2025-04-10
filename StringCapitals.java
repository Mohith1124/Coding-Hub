package com.CodingHub;

public class StringCapitals 
{
	public static void main(String[] args)
	 {
	  String s = "hello all good morning";
	  String newStr ="",capitals="";
	  String str[] = s.split(" ");
	  for(String st:str)
	  {
		char firstChar = st.charAt(0);
	    char cap = Character.toUpperCase(firstChar);
	    String remainingString = st.substring(1);
	    newStr+=cap+remainingString+" ";
	  }
	  System.out.println(newStr);
	 }
}
