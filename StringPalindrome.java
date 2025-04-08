Class StringPalindrome
{
 public static void main(String[] args)
 {
   String s ="Hello World";
   String rev = "";
   for(int i=0;i<s.length();i++)
   {
    rev+=s.charAt(i);
   }
  System.out.println((s.equals(rev)?"Palindrome":"Not a Palindrome");
 }
}