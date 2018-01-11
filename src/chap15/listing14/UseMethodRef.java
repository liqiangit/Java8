package chap15.listing14;

import java.util.ArrayList;
import java.util.Collections;

class UseMethodRef { 
  // A compare() method compatible with the one defined by Comparator<T>. 
  static int compareMC(MyClass a, MyClass b) { 
    return a.getVal() - b.getVal(); 
  } 
 
  public static void main(String args[]) 
  { 
    ArrayList<MyClass> al = new ArrayList<MyClass>(); 
 
    al.add(new MyClass(1)); 
    al.add(new MyClass(4)); 
    al.add(new MyClass(2)); 
    al.add(new MyClass(9)); 
    al.add(new MyClass(3)); 
    al.add(new MyClass(7)); 
 
    // Find the maximum value in al using the compareMC() method. 
    MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC); 
 
    System.out.println("Maximum value is: " + maxValObj.getVal()); 
  } 
}
