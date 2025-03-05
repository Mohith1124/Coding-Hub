class Test{
public static void main(String[] args){
  int age = 42;
  String education = "UG";
  String gender = "Male";
  
  String res = ( age<18 ? "No Scholarships are available for your age" : 
	age<60 ? (education == "UG" ? "Provide scholarship for 30000" :
       (education == "PG" ? "provide scholarship for 40000" :
       "Provide scholarship of 20000") ):
      (age<100 ? (gender == "Female" ?  "Provide retirement amount of 30000" :"Provide retirement amount of 35000" ) : 
       "Nothing is available for your age") ) ;
  System.out.println(res) ;
 } 
}