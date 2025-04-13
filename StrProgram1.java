class StrProgram1
{
 public static void main(String[] args)
 {
  String s = "hello all good morning everyone",newStr="";
  for(int i=0;i<s.length();i++)
  {
    char c = s.charAt(i);
    if(i%2==0)
        newStr +=Character.toUpperCase(c);
    else 
        newStr +=Character.toLowerCase(c);
  }
  System.out.println(newStr);
 }
}