import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int []a=new int[3];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    
    
    int []b={100,200,300,400};
    
    for(int each:b){
      System.out.println(each);
    }
    
   }
 }
