import java.util.Scanner;
class TwoDArray
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows :");
  int rows = sc.nextInt();
  System.out.println("Enter the number of columns :");
  int cols = sc.nextInt();
  int a[][] = new int[rows][cols];
  for(int r=0;r<rows;r++)
  {
   int rowSum=0;
   System.out.println("Enter the "+r+ " row elements :");
   for(int c=0;c<cols;c++)
   {
    a[r][c] = sc.nextInt();
    rowSum+=a[r][c];
   }
    System.out.println("Sum of "+r+ " row is :"+rowSum);
  }
   System.out.println("Array elements are :");
   for(int r=0;r<rows;r++)
   {
    for(int c=0;c<cols;c++)
    {
     System.out.print(a[r][c]+" ");
    }
    System.out.println();
   }
   for(int c=0;c<cols;c++)
   {
    int colSum=0;
    for(int r=0;r<rows;r++)
    {
     colSum+=a[c][r];
    }
     System.out.println("Sum of "+c+ " column is :"+colSum);
   }
 }
}
  