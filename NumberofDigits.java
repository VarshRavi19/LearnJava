import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int a = 100;
    int i=0;
    while(a !=0){
      System.out.println(a);
      System.out.println(i);
      i++;
      a/=10;
      System.out.println(a);
      System.out.println(i);
    }
    System.out.println(i);
   }
 }
