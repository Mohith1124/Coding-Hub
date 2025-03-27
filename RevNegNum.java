class RevNegNum
{
 public static void main(String[] args)
 {
   int a[]={1,-3,-7,-5,-2};
   int neg_size=0;
   for(int i=0;i<a.length;i++)
   {
     if(a[i]<0)
        neg_size++;
    }
   int b[] = new int[neg_size],j=0;
   for(int i=a.length-1;i>=0;i--)
   {
    if(a[i]<0)
    {
      b[j++] = a[i];
    }
   }
   System.out.println("The Array after reversing negative elements are :");
   for(int i=0;i<neg_size;i++)
   {
     System.out.println(b[i]);
    }
 } 
}