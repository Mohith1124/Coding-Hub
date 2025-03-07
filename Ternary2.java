class Trump{
public static void main(String[] args){
  int age = 42;
  String education = "UG";
  String gender = "Male";
 
  String res = age<18 ? "No Scholarships" : 
           age<60 ? education=="UG" ?  "30000" : 
            education=="PG" ? "35000" : 
            "20000" :
          age<100 ? gender=="Female" ? "30000" :
           "35000" :
           "Nothing is available for your age";

    System.out.println(res);
   }
}