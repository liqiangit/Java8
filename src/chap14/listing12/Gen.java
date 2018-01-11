package chap14.listing12;

// A simple generic class hierarchy. 
class Gen<T> {  
  T ob; 
    
  Gen(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
