import java.util.Scanner;
class Two
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows :");
  int rows = sc.nextInt();
  int a[][] = new int[rows][];
  for(int r=0;r<rows;r++)
  {
   System.out.println("Enter the no of cols :");
   int cols = sc.nextInt();
   a[r]=new int[cols];
   System.out.println("Enter the row "+r+ " elements");
   for(int c=0;c<cols;c++)
    {
     a[r][c]=sc.nextInt();
    }
   }
   System.out.println("array elelemnts are :");
   for(int r=0;r<rows;r++)
   {
    for(int c=0;c<a[r].length;c++)
    {
     System.out.print(a[r][c]+" ");
    }
    System.out.println();
}
}
}