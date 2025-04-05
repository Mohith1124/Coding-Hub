class MaxDuplicate
{
 public static int MaxDuplicateelement(int a[])
 {
  int count = 0,maxCount=0,maxElement=a[0];
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a.length;j++)
   {
     if(a[i]==a[j])
        count++;
   }
  if(count>maxCount)
  {
   maxCount = count;
   maxElement = a[i];
  }
}
  return maxElement;
}
public static void main(String[] args)
{
  int a[] = {3,2,1,2,4,5,6,5,5,6,6,6,2,2,2,2};
  int res = MaxDuplicateelement(a);
  System.out.println(res==-1?"No duplicates":res);
 }
}