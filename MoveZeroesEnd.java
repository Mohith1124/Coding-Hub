class MoveZeroesEnd
{
 public static int[] moveZeroes(int a[])
 {
  int newArr[] = new int[a.length];
  for(int i=0,j=0;i<a.length;i++)
  {
   if(a[i]!=0)
   {
    newArr[j++]=a[i];
   }
  }
   return newArr;
 }
  public static void main(String[] args)
  {
    int a[] = {0,1,0,3,12,0};
    int result[] = moveZeroes(a);
    for(int i:result)
       System.out.println(i);
 }
}