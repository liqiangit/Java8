package chap14.listing19;

// Can't create an instance of T. 
class Gen<T> {  
  T ob;  
  Gen() {  
    ob = new T(); // Illegal!!! 
  }  
} 
