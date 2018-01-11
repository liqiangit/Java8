package chap14.listing11;

// Demonstrate a raw type. 
class Gen<T> {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
