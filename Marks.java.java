class Test1{
public static void main(String[] args){
int sub1=82;
int sub2=84;
int sub3=90;
int percentage=(sub1+sub2+sub3)/3;
if(sub1<35||sub2<35||sub3<35) {
      System.out.println("Fail");
  } 
else if(percentage>=90) {
       System.out.println("Grade: A+");
      }
else if(percentage>=80) {
      System.out.println("Grade: A");
      }
else if(percentage>=70) {
      System.out.println("Grade: B");
      }
else {
      System.out.println("No Grade But You Pass The Exams");
      };

  }
}