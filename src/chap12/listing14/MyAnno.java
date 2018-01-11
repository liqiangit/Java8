package chap12.listing14;

import java.lang.annotation.*; 
import java.lang.reflect.*; 
 
// An annotation type declaration. 
@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnno { 
  String str(); 
  int val(); 
} 
