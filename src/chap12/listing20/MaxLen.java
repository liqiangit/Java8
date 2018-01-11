package chap12.listing20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Still another marker annotation that can be applied to a type. 
@Target( ElementType.TYPE_USE ) 
@interface Unique { } 
 
// A parameterized annotation that can be applied to a type. 
@Target(ElementType.TYPE_USE) 
@interface MaxLen {  
  int value(); 
}  
