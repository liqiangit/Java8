package chap28.listing10;

// A simple lock example. 
 
import java.util.concurrent.locks.*; 
 
class LockDemo { 
 
  public static void main(String args[]) { 
    ReentrantLock lock = new ReentrantLock(); 
 
    new Thread(new LockThread(lock, "A")).start(); 
    new Thread(new LockThread(lock, "B")).start(); 
 
  } 
} 
