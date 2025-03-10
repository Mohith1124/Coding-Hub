class DigitPairMultiplication
{
 public static void main(String[] args)
 {   
     
     int num=12345,temp=num,rev=0,res=0,last=0,c=0,rev_last=0,i=1;
     while(num!=0)
     {
       last = num%10;
       c++;
       rev=rev*10+last;
       num=num/10;
     }
       while(i<c/2+1)
       {
       rev_last = rev%10;  //54321
       last=temp%10;
       res += last*rev_last;
       rev=rev/10;
       temp=temp/10;
       i++;
      }
       res +=rev%10;
     System.out.println(res);
    }
}
 
//output : 5*1 + 4*2 + 3 = 16 