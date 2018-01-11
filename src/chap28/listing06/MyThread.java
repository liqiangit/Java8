package chap28.listing06;
  
// A thread of execution that uses a Phaser.  
class MyThread implements Runnable {  
  Phaser phsr;  
  String name;  
  
  MyThread(Phaser p, String n) {  
    phsr = p;  
    name = n;  
    phsr.register(); 
  }  
  
  public void run() {  
      
    System.out.println("Thread " + name + " Beginning Phase One");  
    phsr.arriveAndAwaitAdvance(); // Signal arrival. 
 
    // Pause a bit to prevent jumbled output. This is for illustration  
    // only. It is not required for the proper opration of the phaser. 
    try { 
      Thread.sleep(100); 
    } catch(InterruptedException e) { 
      System.out.println(e); 
    } 
 
    System.out.println("Thread " + name + " Beginning Phase Two");  
    phsr.arriveAndAwaitAdvance(); // Signal arrival. 
 
    // Pause a bit to prevent jumbled output. This is for illustration  
    // only. It is not required for the proper opration of the phaser. 
    try { 
      Thread.sleep(100); 
    } catch(InterruptedException e) { 
      System.out.println(e); 
    } 
 
    System.out.println("Thread " + name + " Beginning Phase Three");  
    phsr.arriveAndDeregister(); // Signal arrival and deregister. 
  }  
}
