package chap15.listing6;

// Use a generic functional interface with lambda expressions. 
 
// A generic functional interface. 
interface SomeFunc<T> { 
  T func(T t); 
} 
