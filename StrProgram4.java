class StrProgram4
{
 public static void main(String[] args)
 {
  String s = "hello all good morning",newStr = "";
  char str[] = s.toCharArray();
  for(int i=0;i<str.length;i++)
  {
   boolean isDuplicate = false;
   for(int j=0;j<i;j++)
   {
     if(str[i]==str[j])                                                           
     {
      isDuplicate = true;
      break;
     }
   }
     if(isDuplicate)    
        newStr += " ";
     else
        newStr += str[i];
  }
  System.out.println(newStr);
 }
}