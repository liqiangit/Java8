package chap12.listing17;

import java.lang.annotation.*; 
import java.lang.reflect.*; 
 
// An annotation type declaration that includes defaults. 
@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnno { 
  String str() default "Testing"; 
  int val() default 9000; 
} 
