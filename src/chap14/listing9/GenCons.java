package chap14.listing9;

// Use a generic constructor. 
class GenCons { 
  private double val; 
 
  <T extends Number> GenCons(T arg) { 
    val = arg.doubleValue(); 
  } 
 
  void showval() { 
    System.out.println("val: " + val); 
  } 
} 
