package chap12.listing19;

import java.lang.annotation.*; 
import java.lang.reflect.*; 
 
// A single-member annotation. 
@Retention(RetentionPolicy.RUNTIME)  
@interface MySingle { 
  int value(); // this variable name must be value 
} 
