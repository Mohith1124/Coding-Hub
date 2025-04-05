class TwoSum
{
 public static int[] twoSum(int a[],int target)
 {
  for(int i=0;i<a.length;i++)
  {
   for(int j=i+1;j<a.length;j++)
   {
    if(a[i]+a[j]==target)
         return new int[]{i,j};
   }
  }
   return new int[]{-1,-1};
}
 public static void main(String[] args)
 {
   int a[] = {2,7,11,15,6,3,1,6};
   int target = 12;
   int result[] = twoSum(a,target);
   if(result[0]!=-1 && result[1]!=-1)
       System.out.println("Indices :"+result[0]+ " and "+result[1]);
   else
       System.out.println("No solution found");
 }
}