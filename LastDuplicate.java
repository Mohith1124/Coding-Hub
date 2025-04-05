class LastDuplicate
{
 public static int lastDuplicateelement(int a[])
 {
  for(int i=a.length-1;i>=0;i--)
  {
   for(int j=a.length-2;j>=0;j--)
   {
     if(a[i]==a[j])
        return a[i];
   }
  }
  return -1;
}
public static void main(String[] args)
{
  int a[] = {3,2,1,2,4,5,6,5,5};
  int res = lastDuplicateelement(a);
  System.out.println(res==-1?"No duplicates":res);
 }
}