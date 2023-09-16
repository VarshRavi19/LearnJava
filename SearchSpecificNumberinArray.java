import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int a[]={1,2,3,4,5};
    int position=0;
    for (int i=0;i<a.length;i++){
      position++;
      System.out.println(position);
      if(a[i]==4)break;
   }
   if(position != 0){
        System.out.println("The given number is found and the position of the number in Array is" + position);
      }
      else
      System.out.println("Given Data not found");
      }
 }

