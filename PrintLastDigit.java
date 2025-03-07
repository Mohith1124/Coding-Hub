class Test12
{
  public static void main(String[] args)
  {  
    int n=12345,rem=0;
    while(n!=0)
    {
      rem=n%10;
      System.out.println(rem);
      n = n/10;
  }
 }
}