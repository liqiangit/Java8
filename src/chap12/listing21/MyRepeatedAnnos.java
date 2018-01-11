package chap12.listing21;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)  
@interface MyRepeatedAnnos { 
  MyAnno[] value(); 
} 
