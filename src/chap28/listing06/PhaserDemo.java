package chap28.listing06;

// An example of Phaser. 
  
import java.util.concurrent.*;  
  
class PhaserDemo {  
  public static void main(String args[]) {  
    Phaser phsr = new Phaser(1);  
    int curPhase; 
  
    System.out.println("Starting");  
  
    new Thread(new MyThread(phsr, "A")).start();  
    new Thread(new MyThread(phsr, "B")).start();  
    new Thread(new MyThread(phsr, "C")).start();  
 
    // Wait for all threads to complete phase one. 
    curPhase = phsr.getPhase(); 
    phsr.arriveAndAwaitAdvance(); 
    System.out.println("Phase " + curPhase + " Complete"); 
 
    // Wait for all threads to complete phase two. 
    curPhase =  phsr.getPhase(); 
    phsr.arriveAndAwaitAdvance(); 
    System.out.println("Phase " + curPhase + " Complete"); 
 
    curPhase =  phsr.getPhase(); 
    phsr.arriveAndAwaitAdvance(); 
    System.out.println("Phase " + curPhase + " Complete"); 
 
    // Deregister the main thread. 
    phsr.arriveAndDeregister(); 
 
    if(phsr.isTerminated()) 
      System.out.println("The Phaser is terminated"); 
  }  
}  
