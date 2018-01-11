package chap15.listing17;
 
class ConstructorRefDemo3 { 
 
  // A factory method for class objects. The class must 
  // have a constructor that takes one parameter of type T. 
  // R specifies the type of object being created. 
  static <R,T> R myClassFactory(MyFunc<R, T> cons, T v) { 
    return cons.func(v); 
  } 
  
  public static void main(String args[]) 
  { 
    // Create a reference to a MyClass constructor. 
    // In this case, new refers to the constructor that 
    // takes an argument. 
    MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new; 
 
    // Create an instance of MyClass by use of the factory method. 
    MyClass<Double> mc = myClassFactory(myClassCons, 100.1); 
 
    // Use the instance of MyClass just created. 
    System.out.println("val in mc is " + mc.getVal( )); 
 
    // Now, create a different class by use of myClassFactory(). 
    MyFunc<MyClass2, String> myClassCons2 = MyClass2::new; 
 
    // Create an instance of MyClass2 by use of the factory method. 
    MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda"); 
 
    // Use the instance of MyClass just created. 
    System.out.println("str in mc2 is " + mc2.getVal( )); 
  } 
}
