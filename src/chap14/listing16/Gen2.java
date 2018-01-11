package chap14.listing16;
 
// A subclass of Gen that overrides getob(). 
class Gen2<T> extends Gen<T> { 
 
  Gen2(T o) { 
    super(o); 
  } 
   
  // Override getob(). 
  T getob() {  
    System.out.print("Gen2's getob(): "); 
    return ob;  
  }  
} 
