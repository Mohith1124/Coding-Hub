class StrProgram3
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
  String s = "hello all good morning everyone";
  String str[] = s.split(" ");
  for(int i=0;i<str.length;i++)
  {
   if(i%2==0)
     System.out.print(str[i].toUpperCase()+ " ");
   else
     System.out.print(reverse(str[i])+ " ");
  }
 }
} 