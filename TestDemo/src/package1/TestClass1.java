package package1;

class Base { 
    
     
	public static void main()  { 
        System.out.println("Static or class method from Base"); 
    } 
      

     public void print()  { 
         System.out.println("Non-static or Instance method from Base"); 
    } 
} 
  

class Derived extends Base { 
      

	public static void main() { 
         System.out.println("Static or class method from Derived"); 
    } 
      

    public void print() { 
         System.out.println("Non-static or Instance method from Derived"); 
   } 
}
    
    class TestClass1{
    public static void main(String args[ ])  { 
	       Base obj1 = new Derived(); 
	         
	     
	       Base.main();   
	         

	       obj1.print();      
	    } 
}