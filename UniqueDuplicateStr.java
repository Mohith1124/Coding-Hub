class UniqueDuplicateStr
{
 public static void main(String[] args)
 {
  String s ="Hello Everyone";
  String unique = "";
  String duplicate = "";
  for(int i=0;i<s.length();i++)
  {
   if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
   {
     unique+=s.charAt(i);
   }
   else
  {
   if(duplicate.indexOf(s.charAt(i))==-1)
   {
     duplicate+=s.charAt(i);
   }
  }
 }
   System.out.println("Duplicate char in the String : "+duplicate);
   System.out.println("Unique char in the String : "+unique);
}
}
   