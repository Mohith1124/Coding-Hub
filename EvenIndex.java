class EvenIndex
{
 public static void main(String[] args)
 {
   int a[] = {1,2,3,4,5,6};
   int n = a.length;
   int b_size = n%2==0?n/2:(n/2+1);
   int b[] = new int[b_size];
   for(int i=0,j=0;i<n;i++)
   {
     if(i%2==0)
     {
       b[j++]=a[i];
     }
   }
   for(int i=0;i<b.length;i++)
   {
     System.out.println(b[i]);
   }
 }
}