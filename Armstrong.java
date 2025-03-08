class Armstrong
{ 
  public static void main(String[] args)
  {
  int num=1634,count=0,sum=0,rem=0,temp=num;
  while(num!=0)
  {
    count++;
    num = num/10;
  }
  num=temp;
  while(num!=0)
 {
   rem = num%10;
   int power =(int) Math.pow(rem,count);
   sum = sum + power;
   num = num/10;
 }
 System.out.println("Number of digits :"+count);
 System.out.println(sum==temp? "Armstrong number":"Not a Armstrong number");
   }

}

