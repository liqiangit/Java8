package chap19.listing13;

// Use a custom comparator.  
import java.util.*;  
  
// A reverse comparator for strings.  
class MyComp implements Comparator<String> {  
  public int compare(String aStr, String bStr) {  
  
    // Reverse the comparison. 
    return bStr.compareTo(aStr);  
  }  
  
  // No need to override equals or the default methods.  
}  
