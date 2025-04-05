class FirstDuplicate
{
 public static int firstDuplicateelement(int a[])
 {
  for(int i=0;i<a.length;i++)
  {
   for(int j=i+1;j<a.length;j++)
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
  int res = firstDuplicateelement(a);
  System.out.println(res==-1?"No duplicates":res);
 }
}