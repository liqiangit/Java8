package chap15.listing13;
 
// This class defines a method called countMatching() that 
// returns the number of items in an array that are equal  
// to a specified value. Notice that countMatching() 
// is generic, but MyArrayOps is not. 
class MyArrayOps { 
  static <T> int countMatching(T[] vals, T v) { 
    int count = 0; 
 
    for(int i=0; i < vals.length; i++) 
      if(vals[i] == v) count++; 
 
      return count; 
  } 
}     
