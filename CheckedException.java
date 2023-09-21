import java.util.*;
import java.io.*;

 // Compiler version JDK 11.0.2

 class CheckedException
 {
   public static void main(String args[]) throws IOException
   {
     System.out.println(" Program Started");
    FileReader file = new FileReader("C:\\Test.txt");
    BufferedReader buffer = new BufferedReader(file);
    System.out.println(buffer.readLine());
    System.out.println(" Program Ended");
   }
 }
 