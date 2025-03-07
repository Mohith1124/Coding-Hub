class Test2
{
  public static void main(String[] args){
  int n1=6,n2=12,i=1,gcf=0;
  int num = n1<n2? n1 : n2 ;
  while(i<=num/2)
  {
    if(num%i==0)
      gcf=i;
      i++;
  }
   System.out.println(gcf);





 }
}
