package chap14.listing13;
 
// A subclass of Gen that defines a second 
// type parameter, called V. 
class Gen2<T, V> extends Gen<T> { 
  V ob2; 
 
  Gen2(T o, V o2) { 
    super(o); 
    ob2 = o2; 
  } 
 
  V getob2() { 
    return ob2; 
  } 
} 
