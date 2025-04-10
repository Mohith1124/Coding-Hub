import java.util.Arrays;
class UniqueDuplicateWordsStr
{
 public static void main(String[] args)
 {
  String s = "one one one three two two",uniqueWords="",duplicateWords="";
  String str[] = s.split(" ");
  Arrays.sort(str);
  int i = 0;
  while(i<str.length)
  {
    int count = 1;
    while(i+count<str.length && str[i].equals(str[i+count]))
    {
     count++;
    }
    if(count>1)
    {
     duplicateWords+=str[i]+" ";
    }
    else
    {
     uniqueWords+=str[i]+" ";
    }
    i+=count;
  }
    System.out.println("Unique Words :"+uniqueWords);
    System.out.println("Duplicate Words :"+duplicateWords); 
  }
}
