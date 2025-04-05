import java.util.Scanner;
class RotateArray
{
 public static int[] rotateArr(int a[],int k)
 {
  int n = a.length;
  k = k%n;
  int newArr[] = new int[a.length];
  for(int i=0;i<k;i++)
  {
    newArr[i] = a[n-k+i];
  }
  for(int i=k;i<n;i++)
  {
    newArr[i]=a[i-k];
  }
    return newArr;
 }
 public static void main(String args[])
 {
   int a[] = {1,2,3,4,5,6,7};
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number to rotate the array to the right by steps :");
   int k = sc.nextInt();
   int result[] = rotateArr(a,k);
   for(int i:result)
       System.out.println(i+" ");
  }
}