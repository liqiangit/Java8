package chap15.listing17;
 
// A simple, non-generic class. 
class MyClass2 { 
  String  str; 
 
  // A constructor that takes an argument. 
  MyClass2(String s) { str = s; } 
 
  // The default constructor. This 
  // constructor is NOT used by this program. 
  MyClass2() { str = ""; } 
 
  // ... 
 
  String getVal() { return str; };   
}     
