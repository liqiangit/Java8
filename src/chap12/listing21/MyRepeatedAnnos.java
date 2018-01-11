package chap12.listing21;

// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)  
@interface MyRepeatedAnnos { 
  MyAnno[] value(); 
} 
