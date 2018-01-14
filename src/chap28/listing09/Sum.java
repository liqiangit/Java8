package chap28.listing09;

import java.util.concurrent.Callable;

// Following are three computational threads. 
 
class Sum implements Callable<Integer> {  
  int stop; 
 
  Sum(int v) { stop = v; } 
 
  public Integer call() {  
    int sum = 0; 
    for(int i = 1; i <= stop; i++) { 
      sum += i; 
    } 
    return sum; 
  } 
} 
