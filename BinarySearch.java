package com.CodingHub;

import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int a[],int key)
    {
        int start = 0;
        int end = a.length;
        while(start<=end){
            int mid = (start + end) /2;
            if(a[mid] == key){
                return mid;
            }
            else if(key<a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
     int[] a = {42,82,97,67,52,12,108};
     Arrays.sort(a);
     for(int i=0;i<a.length;i++)
     {
         System.out.println(a[i]);
     }
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the key to search :");
     int key =sc.nextInt();
     int pos = binarySearch(a,key);
     if (pos ==-1){
         System.out.println("No element found");
        }
     else{
         System.out.println("Element found at index : "+pos);
        }

    }
}
