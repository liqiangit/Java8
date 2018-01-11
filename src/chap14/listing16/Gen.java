package chap14.listing16;

// Overriding a generic method in a generic class. 
class Gen<T> {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    System.out.print("Gen's getob(): " ); 
    return ob;  
  }  
}  
