package chap28;
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
 
// A thread of execution that uses a CyclicBarrier. 
class MyThread implements Runnable { 
  CyclicBarrier cbar; 
  String name; 
 
  MyThread(CyclicBarrier c, String n) { 
    cbar = c; 
    name = n; 
  } 
 
  public void run() { 
     
    System.out.println(name); 
 
    try { 
      cbar.await(); 
    } catch (BrokenBarrierException exc) { 
      System.out.println(exc); 
    } catch (InterruptedException exc) { 
      System.out.println(exc); 
    } 
  } 
} 
 
// An object of this class is called when the  
// CyclicBarrier ends. 
class BarAction implements Runnable { 
  public void run() { 
    System.out.println("Barrier Reached!"); 
  } 
}

