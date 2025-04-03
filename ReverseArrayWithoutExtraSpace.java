class ReverseArrayWithoutExtraSpace
{
 public static void main(String[] args)
 {
   int a[] = {1,2,3,4,5};
   int start = 0;
   int end = a.length-1;
   int temp = 0;
   while(start<=end)
   {
    temp = a[start];
    a[start] = a[end];
    a[end] = temp;
    start++;
    end--;
   }
   for(int i=0;i<a.length;i++)
   {
     System.out.println(a[i]);
   }
 }
}
  