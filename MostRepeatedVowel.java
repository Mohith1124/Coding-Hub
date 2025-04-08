class MostRepeatedVowel
{
 public static void main(String[] args)
 {
  String s = "Hello Good Morning All";
  s = s.toLowerCase()
  int maxCount = 0;
  char vowel =' ';
  for(int i=0;i<s.length();i++)
  {
      System.out.println(s.charAt(i));

   if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
   {
    int count = 0;
    for(int j=0;j<s.length();j++)
    {
     if(s.charAt(i)==s.charAt(j))
     {
      count++;
     }
    }
     System.out.println(maxCount+"   "+count);
     if(count>maxCount)
     {
       maxCount = count;
       vowel = s.charAt(i);
       System.out.println(vowel);
     }
   }
  }
    System.out.println("Most repeated vowel in the given string is :"+vowel+" with count of :"+maxCount);
  }
}
  