import java.util.Arrays;
class Anagram
{
 public static void main(String[] args)
 {
  String s1 = "listen";
  String s2 = "silent";
  char arr1[] = s1.toCharArray();
  char arr2[] = s2.toCharArray();
  if(s1.length()==s2.length())
  {
    arr1 = Arrays.sort(arr1);
    arr2 = Arrays.sort(arr2);
    System.out.println(Arrays.equals(arr1,arr2)?"Anagram":"Not an Anagram");
  }
 }
}