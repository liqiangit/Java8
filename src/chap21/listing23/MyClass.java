package chap21.listing23;

import java.io.Serializable;

class MyClass implements Serializable { 
  String s; 
  int i; 
  double d; 
 
  public MyClass(String s, int i, double d) { 
    this.s = s; 
    this.i = i; 
    this.d = d; 
  } 
 
  public String toString() { 
    return "s=" + s + "; i=" + i + "; d=" + d; 
  } 
}
