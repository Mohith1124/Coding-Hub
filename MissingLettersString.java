class MissingLettersString
{
 public static void main(String[] args)
 {
  String s ="A Quick Brown Fox Jumps Over The Lazy Dog";
  String missingCapitalLetters ="";
  String missingSmallLetters ="";
  for(char c='A';c<='Z';c++)
  {
    if(s.indexOf(c)==-1)
    {
       missingCapitalLetters+=c;
    } 
  }
  for(char c='a';c<='z';c++)
  {
    if(s.indexOf(c)==-1)
    {
       missingSmallLetters+=c;
    } 
  }
   System.out.println("Missing Small Letters : "+missingSmallLetters);
   System.out.println("Missign Capital Letters : "+missingCapitalLetters);
 }
}