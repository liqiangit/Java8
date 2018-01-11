package chap14.listing10;

// A generic interface example. 
 
// A Min/Max interface. 
interface MinMax<T extends Comparable<T>> { 
  T min(); 
  T max(); 
} 
