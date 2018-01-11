package chap15.listing16;
 
class ConstructorRefDemo2 { 
 
  public static void main(String args[]) 
  { 
    // Create a reference to the MyClass<T> constructor. 
    MyFunc<Integer> myClassCons = MyClass<Integer>::new; 
 
    // Create an instance of MyClass<T> via that constructor reference. 
    MyClass<Integer> mc = myClassCons.func(100); 
 
    // Use the instance of MyClass<T> just created. 
    System.out.println("val in mc is " + mc.getVal( )); 
  } 
}
