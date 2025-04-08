class CountWordsCharStr
{
 public static void main(String[] args)
 {
  String s = "Hi Hello All Good Morning";
  int charLength = 0;
  int words = 1;
  for(int i=0;i<s.length();i++)
  {
   charLength++;
    s.charAt(i);
   if(s.charAt(i)==' ')
        words++;
  }
   System.out.println(charLength);
   System.out.println(words);
  } 
}