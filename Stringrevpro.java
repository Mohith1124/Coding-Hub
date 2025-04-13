class Stringrevpro
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
   String s = "Hello all good morning everyone";
   String str[] = s.split(" ");
   for(int i=str.length-1;i>=0;i--)
   {
    if(i%2==0)
       System.out.print(reverse(str[i])+" ");
    else
       System.out.print(str[i]+" ");
   }
 }
}