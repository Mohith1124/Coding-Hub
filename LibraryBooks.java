class LibraryBooks
{
  public static void main(String[] args) {
    String person = "Inter"; //Checking for inter student
    int Number_of_days = 25;
    int Book_price = 1200;
    int Total_fine = 0; //Intially zero

    if(Number_of_days<=15)
    {  
      System.out.println("No fine"); //First 15 days are free
    } 
    else if(person=="BTech" || person=="BSc") //For Btech and Bsc students
    {
      if (Number_of_days<45) 
      {
        Total_fine=(Number_of_days-15)*10;
      } 
      else
      {
        Total_fine=Book_price;
      }
      System.out.println("Total fine is: "+Total_fine);
    } 
    else if(person=="Diploma" || person=="Inter") //For diploma and inter students
    {    
      if(Number_of_days<45) 
      {
       Total_fine=(Number_of_days-15)*20;
      }
      else 
      {
        Total_fine=Book_price;
      }
      System.out.println("Total fine is: "+Total_fine);
    } 
    else //For others
     {
      if(Number_of_days<45) 
      {
        Total_fine=(Number_of_days-15)*30;
      } else 
       {
        Total_fine = Book_price;
       }
      System.out.println("Total fine is: "+Total_fine);
    }
  }
}

