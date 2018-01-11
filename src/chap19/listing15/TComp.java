package chap19.listing15;

// Use a comparator to sort accounts by last name.  
import java.util.*;  
  
// Compare last whole words in two strings.  
class TComp implements Comparator<String> {  
  public int compare(String aStr, String bStr) {  
    int i, j, k;  
  
    // Find index of beginning of last name. 
    i = aStr.lastIndexOf(' ');  
    j = bStr.lastIndexOf(' ');  
  
    k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));  
    if(k==0) // last names match, check entire name  
      return aStr.compareToIgnoreCase(bStr);  
    else  
      return k;  
  }  
  
  // No need to override equals.  
}  
