class Test
{
public static void main(String[] args)
{
 String pname = "Icecream";
 char pcode ='I';
 int pprice = 200;
 int pquantity = 30;
 int ptotal = pprice * pquantity;
 int discount = 0;
 int tax = 18; 
 if(ptotal>=1000 && ptotal<=2000)
 {
   discount= ((ptotal/100)*10) ;
   ptotal = ptotal - discount;
 
 }
  else if(ptotal>=2000 && ptotal<=3000)
 {
   discount =((ptotal/100)*15);
   ptotal = ptotal - discount;
 
 }
  else if(ptotal>=3000 && ptotal<=4000)
  {
   discount = ((ptotal/100)*20);
   ptotal = ptotal - discount;
  
  }
  else if(ptotal>=4000)
 {
  discount = ((ptotal/100)*40);
  
  if(discount>1400)
  {
   discount = 1400;
  }
  ptotal= ptotal - discount;
 }
  tax=ptotal/100 * tax ;
  int bill = ptotal + tax ;
  System.out.println("The Product Name :"+pname);
  System.out.println("The Product Code :"+pcode);
  System.out.println("The Product Price :"+pprice);
  System.out.println("The Product Quantity :"+pquantity);
  System.out.println("The Product Discount:"+discount);
  System.out.println("The Total Tax :"+tax);
  System.out.println("The Final Amount After Including All Taxes :"+bill);

}
}