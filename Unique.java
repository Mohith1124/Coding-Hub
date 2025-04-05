class Unique
{
 public static void main(String[] args)
 {
   int a[] = {3,2,1,2,4,5,6,5,5};
   int firstUnique=-1,lastUnique=-1;
   for(int i=0;i<a.length;i++)
   {
    int count=0;
    for(int j=0;j<a.length;j++)
    {
     if(a[i]==a[j])
     {
       count++;
     }
    }
    if(count==1)
    {
      if(firstUnique==-1)
      {
        firstUnique=a[i];
      }
      lastUnique=a[i];
    }
   }
  System.out.println("First unique element is :"+firstUnique);
  System.out.println("Last unique element is :"+lastUnique);
 }
}

