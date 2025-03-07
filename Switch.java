class Switch
{
 public static void main(String[] args)
 {
  int year = 2024;
  int month =11;
  switch(month)
  {
    case 1,3,5,7,8,10,12:
           System.out.println("31 days");
           break;
    case 4,6,9,11:
           System.out.println("30 days");
	   break;
    case 2:
    switch(year)
    {
     case 2024:
     System.out.println(year%4==0 && year%100!=100 || year%400==0?"29 days":"28 days");
     break;
    }
}
}
}