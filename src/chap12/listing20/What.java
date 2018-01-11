package chap12.listing20;
 
// An annotation that can be applied to a type parameter. 
@Target(ElementType.TYPE_PARAMETER) 
@interface What {  
  String description();  
}  
