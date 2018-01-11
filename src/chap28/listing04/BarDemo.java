package chap28.listing04;

// An example of CyclicBarrier. 
 
import java.util.concurrent.*; 
 
class BarDemo { 
  public static void main(String args[]) { 
    CyclicBarrier cb = new CyclicBarrier(3, new BarAction() ); 
 
    System.out.println("Starting"); 
 
    new Thread(new MyThread(cb, "A")).start(); 
    new Thread(new MyThread(cb, "B")).start(); 
    new Thread(new MyThread(cb, "C")).start(); 
 
  } 
} 
