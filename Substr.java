class Substr
{
 public static void main(String[] args)
	 {
	   String s = "abab",newStr="",strnew="";
	   for(int i=0;i<s.length();i++)
	   {
	    for(int j=i+1;j<=s.length();j++)
	    {
	     newStr+=(s.substring(i,j))+" ";
	    }
	   }
	      //System.out.println(newStr+" ");
	      newStr=newStr.trim();
	      String[] str=newStr.split(" ");
	      for(String st:str)
	      {
	    	  if(strnew.indexOf(st+" ")==-1)
	    	  {
	    		strnew+=st+" ";
	    	  }
	      }
	      System.out.println(strnew);
	  }
}