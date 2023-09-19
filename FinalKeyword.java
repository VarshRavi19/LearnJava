import java.util.*;

 // Compiler version JDK 11.0.2

 class Parent
 {
   final double interest= 10.5;
   
   Parent(){
   System.out.println("Inside Parent Constructor");
     }
     
   final void display(){
   System.out.println("Inside Parent Method");
     }
 }
 
 class Child extends Parent
 {
   Child(){
   System.out.println("Inside Child Constructor");
     }
     
   void display(){  //Error cuz final method cannot be overridden
   System.out.println("Inside Child Method");
     }
 }
 
 final class FinalParent
 {
   void display(){
   System.out.println("Inside Parent Method");
     }
 }
 
 class Child2 extends FinalParent // Error cuz final class cannot be inherited
 {
 void show(){
   System.out.println("Inside Parent Method");
     }
 }
 
 class SuperKeywordMain
 {
   public static void main(String args[])
   {
    Parent p=new Parent();
    p.interest=20.0; // Error cuz final variable cannot be modified
    System.out.println(p.interest);
    Child c=new Child();
    c.display();
   }
 }
