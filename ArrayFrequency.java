import java.util.Arrays;
class ArrayFrequency
{
 public static void main(String[] args)
 {
  int a[] = {5,4,3,2,4,5,6,7,8,9,7,0};
  int n = a.length;
  int count = 1;
  Arrays.sort(a);
  for(int i=1;i<a.length;i++)
  {
    if(a[i]==a[i-1])
    {
      count++;
    }
    else
    {
      System.out.println("Frequency of "+a[i-1]+" is :"+count);   
      count = 1;
    }
   }
    System.out.println("Frequency of "+a[n-1]+" is :"+count);
   }
}
   
