import java.util.*;

 // Compiler version JDK 11.0.2

 class Parent
 {
   double interest= 10.5;
   
   Parent(){
   System.out.println("Inside Parent Constructor");
     }
     
   void display(){
   System.out.println("Inside Parent Method");
     }
 }
 
 class Child extends Parent
 {
   double interest= 15.5;
   
   Child(){
     super();
   System.out.println("Inside Child Constructor");
     }
     
   void show(){
  System.out.println(super.interest);
     } 
     
   void display(){
   super.display();
   System.out.println("Inside Child Method");
     }
 }
 
 class SuperKeywordMain
 {
   public static void main(String args[])
   { 
    Child c=new Child();
    c.show();
    c.display();
   }
 }
