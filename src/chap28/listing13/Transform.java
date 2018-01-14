package chap28.listing13;

// A simple program that lets you experiment with the effects of 
// changing the threshold and parallelism of a ForkJoinTak. 
import java.util.concurrent.*;  
 
// A ForkJoinTask (via RecursiveAction) that performs a 
// a transform on the elements of an array of doubles. 
class Transform extends RecursiveAction { 
 
  // Sequential threshold, which is set by the construtor. 
  int seqThreshold; 
 
  // Array to be accessed. 
  double[] data; 
 
  // Deterines what part of data to process. 
  int start, end; 
 
  Transform(double[] vals, int s, int e, int t ) { 
    data = vals; 
    start = s; 
    end = e; 
    seqThreshold = t; 
  } 
 
  // This is the method in which parralell computation will occur. 
  protected void compute() { 
 
    // If number of elements is below the sequential threshold, 
    // then process sequentially. 
    if((end - start) <= seqThreshold) { 
      // The following code assigns an element at even an index the 
      // square root of its original value. An elements at an odd 
      // index is assigned its cube root. This code is designed 
      // to simply consume CPU time so that the effects of concurrent 
      // execution are more readily observable. 
      for(int i = start; i < end; i++) { 
        if((data[i] % 2) == 0) 
          data[i] = Math.sqrt(data[i]); 
        else  
          data[i] = Math.cbrt(data[i]); 
      } 
    } 
    else { 
      // Otherwise, continue to break the data into smaller peices. 
 
      // Find the midpoint. 
      int middle = (start + end) / 2; 
 
      // Invoke new tasks, using the subdivided data. 
      invokeAll(new Transform(data, start, middle, seqThreshold), 
                new Transform(data, middle, end, seqThreshold)); 
    } 
  } 
} 
