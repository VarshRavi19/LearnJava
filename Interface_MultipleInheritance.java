import java.util.*;

interface A{
  
  int a =10;
  int b = 20;
  
  void sum();
  
 }
 
 interface B{
  
  int x =10;
  int y = 20;
  
  void mul();
  
 }
 
 class C implements A,B{
   
   public void sum(){
     System.out.println("Sum" + " " + (a+b));
     }
    
     public void mul(){
     System.out.println("Sum" + " " + a*b);
     }
   }
   
 class Main {
   
   public static void main(String args[]){
   C c=new C();
   c.sum();
   c.mul();
   }
   }
 
 
