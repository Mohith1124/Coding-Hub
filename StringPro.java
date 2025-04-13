class StringPro
{
 public static void main(String[] args)
 {
  String s = "hello ALL morning",newStr="";
  String str[] = s.split(" ");
  for(int i=0;i<str.length;i++)
  {
    for(int j=0;j<str[i].length();j++)
    {
     char letter = str[i].charAt(j);
    if(i==0 || i==str.length-1)
    {
      newStr+=Character.toUpperCase(letter);
    }
    else if(i==str.length-1)
    {
      newStr+=Character.toUpperCase(letter);
    }
    else
    {
      newStr+=Character.toLowerCase(letter);
    }
   }
   newStr+=" ";

  }
   System.out.println(newStr.trim());
}
}