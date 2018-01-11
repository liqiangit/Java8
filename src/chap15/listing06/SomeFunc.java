package chap15.listing06;

// Use a generic functional interface with lambda expressions. 
 
// A generic functional interface. 
interface SomeFunc<T> { 
  T func(T t); 
} 
