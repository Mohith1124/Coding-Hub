class StringProblem
{
 public static void main(String[] args)
 {
  String s = "HELLo all";
  String s2 = ""; //to store even char in lower case
  String s3 = "" ;//to store odd char in uppercase
  String s4 = ""; //to store s2 in reverse and concatenate s3
  for(int i=0;i<s.length();i++)
  {
   if(i%2==0)
  {
    s2+=s.charAt(i);
    s2=s2.toLowerCase();
  }
  else
  {
    s3+=s.charAt(i);
    s3=s3.toUpperCase();
  }
 }
  for(int i=s2.length()-1;i>=0;i--)
  {
    s4+=s2.charAt(i);
  }
  String finalString  = s4+s3 ;
  System.out.println(finalString);
  }
}