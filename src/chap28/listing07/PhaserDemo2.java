package chap28.listing07;
 
class PhaserDemo2 {  
  public static void main(String args[]) {  
  
    MyPhaser phsr = new MyPhaser(1, 4); 
  
    System.out.println("Starting\n");  
  
    new Thread(new MyThread(phsr, "A")).start();  
    new Thread(new MyThread(phsr, "B")).start();  
    new Thread(new MyThread(phsr, "C")).start();  
 
    // Wait for the specified number of phases to complete.. 
    while(!phsr.isTerminated()) { 
      phsr.arriveAndAwaitAdvance(); 
    } 
 
    System.out.println("The Phaser is terminated"); 
  }  
}  
