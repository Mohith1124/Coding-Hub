class PalindromeNum
{
 public static void main(String[] args)
 {
   int num=12000,rev=0,temp=num,last=0,zeroes=0,res=0,rerev=0;
   while(num!=0)
   {
     last = num%10;
     if(last==0)
     {
       zeroes++;
     }
     rev = rev*10+last;
     num = num/10;
   } 
   while(rev!=0)
   {
     last = rev%10;
     rerev = rerev*10+last;
     rev = rev/10;
   } 
     res = (int)Math.pow(10,zeroes);
     System.out.println(res*rerev==temp?"Palindrome":"Not a palindrome");

  }
}
