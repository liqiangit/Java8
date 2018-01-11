package chap14.listing14;
  
// Create a Gen object. 
class HierDemo2 {  
  public static void main(String args[]) {  
    
    // Create a Gen object for String. 
    Gen<String> w = new Gen<String>("Hello", 47); 
    
    System.out.print(w.getob() + " "); 
    System.out.println(w.getnum()); 
  }  
}
