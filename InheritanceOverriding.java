import java.util.*;

 class Parent
 {
   int a;
   int b=10;
   Parent(){
     System.out.println("Inside Parent Constructor");
     }
     
     void show(){
       System.out.println("Inside Parent Method " + a);
       }
       
       
     void display(){
       System.out.println("Inside Parent Method " );
       }
 }
 
 class Child extends Parent
 {
   int b=20;
   Child(){
     System.out.println("Inside Child Constructor");
     }
     
     void display(){
       System.out.println("Inside Child Method ");
       }
 }
 
 class MainMethod{
   
   public static void main(String args[]){
     Child c=new Child();
     c.a=10;
     c.show();
     c.display();
     }
   }
