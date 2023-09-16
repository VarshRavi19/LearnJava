import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int a[]={1,2,3,4,5,6};
    int smallest=a[0];
    int largest=a[0];   
    for(int c:a){
     if(smallest>c)
     smallest=c;
     if(largest<c)
     largest=c;
      }
      System.out.println("Largest number is "+largest+" Smallest Number is "+smallest);
   }
 }
