import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   {
    int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<a[0].length;j++){
        System.out.println(a[i][j]);
      }
    }
    
    for(int []k : a){
      for(int l:k){
        System.out.println(l);
      }
    }
   }
 }
