package chap28.listing01;
// A simple semaphore example. 
 
import java.util.concurrent.Semaphore; 
 
class SemDemo { 
 
  public static void main(String args[]) { 
    Semaphore sem = new Semaphore(1); 
 
    new Thread(new IncThread(sem, "A")).start(); 
    new Thread(new DecThread(sem, "B")).start();
 
  } 
} 
