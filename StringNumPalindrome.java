class StringNumPalindrome
{
 public static void main(String[] args) 
 {
  String s = "A1B2C3D4 123";
  String digits = "";
  for(int i=0;i<s.length();i++)
  {
   if(s.charAt(i)>='0' && s.charAt(i)<='9')
         digits+=s.charAt(i);
  }
  String digitrev = "";
  for(int i=s.length()-1;i>=0;i--)
  {
    digitrev+=s.charAt(i);
  }
  System.out.println((digits.equals(digitrev)?"Palindrome":"Not Palindrome");
 }
}