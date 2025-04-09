/*
class ArrayFrequency
{
 public static void main(String[] args)
 {
  int a[] = {1,2,3,2,1,4,5,6,7,6,5,4,8,9,0,6,4};
  for(int i=0;i<a.length;i++) 
  {
   boolean isCounted = false;
   for(int k=0;k<i;k++) 
   {
    if(a[i]==a[k]) 
    {
     isCounted = true;
     break;
    }
   }
    if(isCounted)
        continue ;
    int count = 0;
    for(int j=0;j<a.length;j++)
    {       
      if(a[i]==a[j])
      {
        count++;
        boolean isCount = true;
      }
    }
     System.out.println("Frequency of "+a[i]+" is :"+count);
   }
  }
}
  */
import java.util.Arrays;
class ArrayFrequency
{
 public static void main(String[] args)
 {
  int a[] = {1,2,2,3,3,3,4,4};
  int n = a.length;
  Arrays.sort(a);
  int count = 1;
  for(int i=1;i<a.length;i++)
  {
    if(a[i]==a[i-1])
    {
      count++;
    }
    else
    {
      System.out.println("Frequency of "+a[i-1]+" is :"+count); 
    }
   }
    System.out.println("Frequency of "+a[n-1]+" is :"+count);
   }
}
    