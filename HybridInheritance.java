import java.util.*;

class A{
  
  void display(){
      System.out.println("Inside Parent Class");
    }
  
  }
  
interface B{
  
  void show();
  
  }
  
interface C{
  
  void shows();
  
  }
  
class D extends A implements B,C{
  
  public void show(){
      System.out.println("Inside implemented B Method");
    }
    
  public  void shows(){
      System.out.println("Inside implemented C Method");
    }
  
  }
  
  class Main{
    
    public static void main(String args[]){
      D d=new D();
      d.display();
      d.show();
      d.shows();
      }
    
    }