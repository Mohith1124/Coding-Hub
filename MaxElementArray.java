import java.util.Scanner;
class MaxElementArray
{
 public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter n :");
  int n = sc.nextInt();
  int arr[] = new int[n];
  System.out.println("Enter "+n+" elements : ");
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
  }
  System.out.println("The Array elements are : ");
  for(int i=0;i<n;i++)
  {
   System.out.println(arr[i]);
  }
  int max =arr[0];
  for(int i=0;i<n;i++)
  {
   if(arr[i]>max);
       max = arr[i];
  }
  System.out.println("Max element is :"+max);
 }
}
