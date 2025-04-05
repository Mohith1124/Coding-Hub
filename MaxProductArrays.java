import java.util.Arrays;
class MaxProductArrays
{
 public static void main(String[] args)
 {
  int a[] = {1,3,-5,2,8};
  Arrays.sort(a);
  int maxProduct=a[a.length-1] * a[a.length-2];
  System.out.println("The maximum product of two numbers in the array : "+maxProduct);
 }
}
 