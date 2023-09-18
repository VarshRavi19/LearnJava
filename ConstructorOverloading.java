import java.util.*;

 // Compiler version JDK 11.0.2
 class Constructor {
   public static int a;
   public static int b;
   public static int c;
   
   Constructor(int a,int b){
       System.out.println("Constructor of 2 int");
       this.a=a;
       this.b=b;
     }
     
   Constructor(int c){
     System.out.println("Constructor of 1 int");
      this.c=c;
     }
     
   public static int sum(){
     int sum=a+b+c;
     System.out.println(a +" " + b +" " +c+" " + sum);
     return sum;
     }
   }
 class ContructorMain
 {
   public static void main(String args[]){
     Constructor cons = new Constructor(15,25);
     Constructor cons2=new Constructor(40);
     System.out.println(Constructor.sum());
     }
 }
