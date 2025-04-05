class MissingNumber
{
 public static void main(String[] args)
 {
  int a[] = {1,2,4,5,6};
  int n = a.length+1;
  int sumOfNaturalNumbers = n * (n+1) / 2;
  int arrSum = 0;
  for(int i:a)
     arrSum+=i;
  int missingNumber = sumOfNaturalNumbers - arrSum;
  System.out.println("The missing number in the array is : "+missingNumber);
 }
}