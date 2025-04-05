class InsertElement
{
  public static void insertAtIndex(int a[],int ele,int index)
  {
    if(index<0 || index>a.length)
    {
         System.out.println("Index out of bounds error");
         return;
    }
    int newArr[] = new int[a.length+1];
    for(int i=0;i<index;i++)
    {
      newArr[i]=a[i];
    }
     newArr[index]=ele;
    for(int i=index+1;i<newArr.length;i++)
    {
      newArr[i]=a[i-1];
    }
    System.out.println("Array after insertion :");
    for(int i:newArr)
    {
      System.out.println(i+" ");
    }
  }
  public static void main(String[] args)
  {
    int a[] = {1,2,3,5,6};
    insertAtIndex(a,4,3);
  } 
}
 
  





































/*
class InsertElement {
  
  public void insertAtIndex(int[] a, int ele, int index) {
    if(index < 0 || index > a.length) {
      System.out.println("Index out of bounds.");
      return;
    }

    int[] newArray = new int[a.length + 1];
    
    for (int i = 0; i < index; i++) {
      newArray[i] = a[i];
    }
    
    newArray[index] = ele;

    for (int i = index + 1; i < newArray.length; i++) {
      newArray[i] = a[i - 1];
    }
    
    System.out.print("Array after insertion: ");
    for (int i : newArray) {
      System.out.print(i + " ");
    }
  }
  
  public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5};
    InsertElement obj = new InsertElement();
    obj.insertAtIndex(a, 99, 2);
  }
}




















*/  