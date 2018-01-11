package chap28.listing10;
 
// A thread of execution that increments count. 
class LockThread implements Runnable { 
  String name; 
  ReentrantLock lock; 
 
  LockThread(ReentrantLock lk, String n) { 
    lock = lk; 
    name = n; 
  } 
 
  public void run() { 
     
    System.out.println("Starting " + name); 
 
    try { 
      // First, lock count. 
      System.out.println(name + " is waiting to lock count."); 
      lock.lock(); 
      System.out.println(name + " is locking count."); 
 
      Shared.count++; 
      System.out.println(name + ": " + Shared.count); 
 
      // Now, allow a context switch -- if possible. 
      System.out.println(name + " is sleeping."); 
      Thread.sleep(1000); 
    } catch (InterruptedException exc) { 
      System.out.println(exc); 
    } finally { 
      // Unlock 
      System.out.println(name + " is unlocking count."); 
      lock.unlock(); 
    } 
  } 
}