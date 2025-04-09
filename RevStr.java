class RevStr
{
 public static void main(String[] args)
 {
   String s = "hello everyone",rev="";
   for(int i=0;i<s.length();i++)
   {
     char letter = s.charAt(s.length()-i-1);
      rev+=letter;
   }
     System.out.println(rev);
 }
}