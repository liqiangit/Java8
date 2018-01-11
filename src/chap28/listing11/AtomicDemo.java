package chap28.listing11;

// A simple example of Atomic. 
 
import java.util.concurrent.atomic.*; 
 
class AtomicDemo { 
 
  public static void main(String args[]) { 
    new Thread(new AtomThread("A")).start(); 
    new Thread(new AtomThread("B")).start(); 
    new Thread(new AtomThread("C")).start(); 
  } 
} 
