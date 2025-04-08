class Strings
{
 public static void main(String[] args)
 {
  String s = "HelLo@123 All";
  int vowels=0,consonants=0,capitals=0,small=0,digits=0,spaces=0,symbols=0;
  for(int i=0;i<s.length();i++)
  {
   char letter = s.charAt(i);
   if(letter>='A' && letter<='Z')
   {
     capitals++;
     if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
           vowels++;
     else
           consonants++;
   }
   else if(letter>='a' && letter<='z')
   {
     small++;
     if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
           vowels++;
     else
           consonants++;
   }
   else if(letter>='0' && letter<='9')
   {
     digits++;
   }
   else if(letter==' ')
   {
    spaces++;
   }
   else
   {
    symbols++;
   }
  }
   System.out.println("Capitals: " + capitals);
   System.out.println("Small letters: " + small);
   System.out.println("Vowels: " + vowels);
   System.out.println("Consonants: " + consonants);
   System.out.println("Digits: " + digits);
   System.out.println("Spaces: " + spaces);
   System.out.println("Symbols: " + symbols); 


   //Using Ternary Operator
   /*
   for(int i=0;i<s.length();i++)
   {
     char letter = s.charAt(i);
     capitals += (letter >= 'A' && letter <= 'Z') ? 1 : 0;
     small += (letter >= 'a' && letter <= 'z') ? 1 : 0;
     vowels += ((letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || 
     letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')) ? 1 : 0;
     consonants += ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) &&
                  !(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || 
                  letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') ? 1 : 0;
     digits += (letter >= '0' && letter <= '9') ? 1 : 0;
     spaces += (letter == ' ') ? 1 : 0;
     symbols += !((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z') || 
                (letter >= '0' && letter <= '9') || (letter == ' ')) ? 1 : 0;
    }
   System.out.println("Capitals: " + capitals);
   System.out.println("Small letters: " + small);
   System.out.println("Vowels: " + vowels);
   System.out.println("Consonants: " + consonants);
   System.out.println("Digits: " + digits);
   System.out.println("Spaces: " + spaces);
   System.out.println("Symbols: " + symbols);
                                                     */
 }
}