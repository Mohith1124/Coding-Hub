class EvenOddArray
{
 public static void main(String[] args)
 {
   int a[]={10,20,30,40,50,60};
   int n=a.length,c=0;
   int b[]=new int[n];
   for(int i=0;i<n;i++)
   {
    if(a[i]%2==0) 
    {
        b[c]=a[i];//2,4,6
        c++;      //1,2,3
    }            
   }
   for(int i=0;i<n;i++)
   {
    if(a[i]%2!=0)
    {
        b[c]=a[i];//1,3,5
        c++;      //4,5,6
    }
   }
   for(int i=0;i<n;i++)
   {
     System.out.println(b[i]);
   }
 }
}

     