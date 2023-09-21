import java.util.*;

 class UncheckedException
 {
   public static void main(String args[])
   { 
    int a=10;
    System.out.println(a);
    try{
     System.out println((a/0));
     }
     catch(ArithmeticException e){
       System.out.println("Handling Arithmetic Exception using try catch block");
       }
   }
   
 }