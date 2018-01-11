package chap14.listing14;
 
// A generic subclass. 
class Gen<T> extends NonGen {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen(T o, int i) {  
    super(i); 
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
