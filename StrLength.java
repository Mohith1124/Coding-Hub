class StrLength
{
 public static void main(String[] args)
 {
   String s = "Hello good morning";
   char a[]=s.toCharArray();
   int len = 0 ;
   for(char c:a)
   {
     len++;
    }
  System.out.println("lenth of a string is :"+len);
 }
}