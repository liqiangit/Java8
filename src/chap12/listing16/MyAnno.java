package chap12.listing16;

// Show all annotations for a class and a method. 
import java.lang.annotation.*; 
import java.lang.reflect.*; 
 
@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnno { 
  String str(); 
  int val(); 
} 
