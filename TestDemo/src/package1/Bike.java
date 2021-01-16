package package1;

interface A{  
 
  void c();  
  
}  
  
class B implements A{  
 public void c() {System.out.println("I am c");}  
}  
  
  
class Bike{  
public static void main(String args[]){  
B a=new B();  

a.c();  
 
}}  