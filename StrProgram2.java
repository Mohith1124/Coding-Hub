class StrProgram2
{
 public static String reverse(String s)
 {
  String rev ="";
  for(int i=0;i<s.length();i++)
  {
    char c = s.charAt(i);
    rev = c + rev;
  }
  return rev;
 }
 public static void main(String[] args)
 {
   String s = "hello all good morning everyone",newStr = "";
   String str[] = s.split(" ");
   for(int i=0;i<str.length;i++)
   {
     if(i%2==0)
        newStr +=reverse(str[i]+" ");
     else
     {
        for(int j=0;j<str[i].length();j++)
        {
         char c =str[i].charAt(j);
         if(j%2==0)
             newStr += Character.toUpperCase(c);
         else
             newStr += c; 
        }
      }
      newStr += " ";
    }
   System.out.println(newStr);
  }
}     
   