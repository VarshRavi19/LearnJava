import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   {
    String str1="WELCOME";
    System.out.println(str1.equalsIgnoreCase("welcome"));
    System.out.println(str1.equals("welcome"));
    String str2= "Let's";
    String str3= " Learn some String Functions";
    System.out.println(str2.concat(str3));
    String str4="hello";
    System.out.println(str4.length());
    System.out.println(str4.substring(1,3));
    System.out.println(str4.toUpperCase());
    System.out.println(str1.toLowerCase());
   }
 }
