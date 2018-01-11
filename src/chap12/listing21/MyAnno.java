package chap12.listing21;

// Demonstrate a repeated annotation.

import java.lang.annotation.*; 
import java.lang.reflect.*; 

// Make MyAnno repeatable
@Retention(RetentionPolicy.RUNTIME)  
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno { 
  String str() default "Testing"; 
  int val() default 9000; 
} 
