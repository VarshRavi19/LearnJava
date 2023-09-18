import java.util.*;

 // Compiler version JDK 11.0.2

 class StudentData
 {
   String sname;
   int sid;
   int s1marks;
   int s2marks;
   int s3marks;
   
   public void assignData(String sname,int sid){
     this.sname=sname;
     this.sid=sid;
     }
     
   public void assignMarks(int s1marks,int s2marks,int s3marks){
     this.s1marks=s1marks;
     this.s2marks=s2marks;
     this.s3marks=s3marks;
     }
     
   public void displayAll(){
   int total=0;
   System.out.println(sname);
   System.out.println(sid);
   System.out.println(s1marks);
   System.out.println(s2marks);
   System.out.println(s3marks);
   total=s1marks+s2marks+s3marks;
   System.out.println(total);
   }
 }
 
 class StudentMain
 {
   public static void main(String args[]){
     StudentData s1=new StudentData();
     s1.assignData("Varsha",121001136);
     s1.assignMarks(100,99,98);
     s1.displayAll();
     }
   }
