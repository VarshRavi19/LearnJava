import java.util.*;

 // Compiler version JDK 11.0.2

 class Overloading
 {
   public int sum(int a,int b){
     int sum= a + b;
     return sum;
     }
     
     public int sum(int a,int b, int c){
     int sum= a + b + c;
     return sum;
     }
     
     public double sum(double a,double b){
     double sum= a + b;
     return sum;
     }
     
     public double sum(double a,double b, double c){
     double sum= a + b + c;
     return sum;
     }
 }
 
 class OverloadingMain{
   public static void main(String args[]){
     Overloading o =new Overloading();
     System.out.println(o.sum(5,6));
     System.out.println(o.sum(3,8,4));
     System.out.println(o.sum(1.5,2.5));
     System.out.println(o.sum(1,2,3.0));
     }
  }
