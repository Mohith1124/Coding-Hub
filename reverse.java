class ReverseArray
{
 public static void main(String[] args)
 {
   int a[] = {1,2,3,4};
   int n = a.length,;
   int[] b = new int[n];
   for(int i=0;i<n;i++)
   {
     b[i]=a[n-1-i];
     c++;
   }
  for(int i=0;i<n;i++)
      System.out.println(b[i]);
 }
}