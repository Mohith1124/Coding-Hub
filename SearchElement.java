import java.util.Scanner;
class SearchElement
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
  System.out.println("Enter the element you want to search :");
  int Element = sc.nextInt();
  boolean isElementFound = false;
  for(int i=0;i<n;i++)
  {
   if(Element==arr[i])
      isElementFound = true;
  }
   if(isElementFound)
      System.out.println("ELement found");
   else
      System.out.println("Element not found");
  }
 }

