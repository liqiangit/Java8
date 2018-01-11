package chap12.listing20;
 
// Still another marker annotation that can be applied to a type. 
@Target( ElementType.TYPE_USE ) 
@interface Unique { } 
 
// A parameterized annotation that can be applied to a type. 
@Target(ElementType.TYPE_USE) 
@interface MaxLen {  
  int value(); 
}  
