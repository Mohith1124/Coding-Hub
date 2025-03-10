class NumToString 
{
 public static void main(String[] args)
 { 
   int num=12045060,temp=num,div=1,count=0;
   while(temp!=0)
   {
    count++;
    temp=temp/10;
   }
   div=(int) Math.pow(10,(count-1));
   while(div!=0)
   {
    int first=num/div;
    num=num%div;
    div = div/10;
    switch(first)
    { 
      case 0:
         System.out.print("Zero ");
         break;
      case 1:
         System.out.print("One ");
         break;
      case 2:
         System.out.print("Two ");
         break;
      case 3:
         System.out.print("Three ");
         break;
      case 4:
         System.out.print("Four ");
         break;
      case 5:
         System.out.print("Five ");
         break;
      case 6:
         System.out.print("Six ");
         break;
      case 7:
         System.out.print("Seven ");
         break;
      case 8:
         System.out.print("Eight ");
         break;
      case 9:
         System.out.print("Nine ");
         break;



    }
  }
}
}