class Coding{
public static void main(String[] args){
 int num = 400;
 int year = 365;
 int month = 30; 
 int week = 7;
 int day = 1;
 
 if(num>=year)
 {
   int years=num/year;
   System.out.println(years+"years");
   num=num%year;
 }
  if(num>=month)
 {
    int months=num/month;
    System.out.println(months+"months");
    num=num%month;
 }
  if(num>=week)
 {
    int weeks=num/week;
     System.out.println(weeks+"weeks");
     num=num%week;
 }
 if(num<7)
 {
      System.out.println(num+"days");
 }

 }
}