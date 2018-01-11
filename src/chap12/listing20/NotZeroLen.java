package chap12.listing20;

// Demonstrate several type annotations. 
import java.lang.annotation.*;  
import java.lang.reflect.*;  
 
// A marker annotation that can be applied to a type. 
@Target(ElementType.TYPE_USE) 
@interface TypeAnno { } 
 
// Another marker annotation that can be applied to a type.  
@Target(ElementType.TYPE_USE) 
@interface NotZeroLen {  
}  
