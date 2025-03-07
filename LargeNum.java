class LargeNum
{
  public static void main(String[] args)
  {

   int n1=1000,n2=200,n3=30;
   String res = n1>n2 && n1>n3 ? "n1 is larger":n2>n1 && n2>n3 ?"n2 is larger":"n3 is larger" ;
   System.out.println(res);
   
}
}