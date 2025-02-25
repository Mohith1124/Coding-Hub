class Test2
{
  public static void main(String[] args){
  String person="Inter";
  int Number_of_days =20;
  int Book_price= 1200;
  int Total_fine=0;
  if(person=="BTech" || person=="BSc"){
     if(Number_of_days>15 && Number_of_days<45){
         Number_of_days=Number_of_days-15;
         Total_fine=Number_of_days * 10;
         System.out.println("Total fine is :"+Total_fine);
       }
     else{
         Total_fine=Book_price;
         System.out.println("Total fine is :"+Total_fine);
     }
}
  else if(person=="Diploma" || person=="Inter"){    
      if(Number_of_days>15 && Number_of_days<45){
         Number_of_days=Number_of_days-15;
         Total_fine=Number_of_days * 20;
         System.out.println("Total fine is :"+Total_fine);
       }
      else{
         Total_fine=Book_price;
         System.out.println("Total fine is :"+Total_fine);
     }
}
  else{
         Total_fine=Number_of_days * 30;
         System.out.println("Total fine is :"+Total_fine);
      } 
}
}
