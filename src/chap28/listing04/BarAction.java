package chap28.listing04;
 
// An object of this class is called when the  
// CyclicBarrier ends. 
class BarAction implements Runnable { 
  public void run() { 
    System.out.println("Barrier Reached!"); 
  } 
}
