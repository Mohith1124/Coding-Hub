class StringRepeatition
{
 public static void main(String[] args)
 {
   String s = "a1b2c3d4e5";
   for(int i=0;i<s.length();i+=2)
   {
    char letters = s.charAt(i);
    int digits =Character.getNumericValue(s.charAt(i+1));
    String result ="";
    result+=String.valueOf(letters).repeat(digits);
    System.out.print(result);  

   }
  }
}