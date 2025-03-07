class EamcetRank {
public static void main(String[] args){
int rank = 1234;
String caste = "OC" ;
boolean EWS = true;

if(rank < 1000) 
{
    if(caste =="SC" || caste =="ST")
   {
    System.out.println("Congratulations You will get seat in");
    System.out.println("All Jntu-A Universities");
   }
    else
   {
     if(EWS)
     { 
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Universities");
     }
     else
     {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Colleges");
     }
   } 
}
else if(rank < 5000)
{
    if(caste =="SC" || caste =="ST")
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 1 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 2 Colleges");
    }
   }
    else 
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 2 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 3 Colleges");
    }
   }
 }
 else if(rank < 15000)
{
    if(caste =="SC" || caste =="ST")
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 2 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 3 Colleges");
    }
   }
    else 
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 3 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 4 Colleges");
    }
   }
 }
 else if(rank < 30000)
{
    if(caste =="SC" || caste =="ST")
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Jntu-A Tier 4 Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Good Colleges");
    }
   }
    else 
   {
    if(EWS)
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Good Colleges");
    }
    else
    {
      System.out.println("Congratulations You will get seat in");
      System.out.println("All Average Colleges");
    }
   }
 }
 else if(rank < 50000)
 {
  System.out.println("Congratulations You will get seat in");
  System.out.println("All Below Average Colleges");
 }
 else 
 {
  System.out.println("Congratulations You will get seat in");
  System.out.println("All Below Average Colleges but not sure that you will get placemenets");
 }

}

}



 
  
    




