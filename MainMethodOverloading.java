import java.util.*;

 // Compiler version JDK 11.0.2

 class MainMethodOverloading
 {
   
   void main(int a){
     System.out.println(a + " Inside void return int input method");
     }
     
   void main(double a){
     System.out.println(a + "Inside void return double input method");  
     }
     
   void main(){
     System.out.println("Inside void return no parameter method");
     }
     
   int main(int a,int b){
     System.out.println("Inside int return and 2 int input method");
     int sum=a+b;
     return sum;
     }
   public static void main(String args[])
   { 
    System.out.println("Inside Main Main Method");
    MainMethodOverloading o=new MainMethodOverloading();
    o.main(1);
    o.main(2.0);
    o.main();
    System.out.println("Sum" + o.main(1,5));
   }
 }
