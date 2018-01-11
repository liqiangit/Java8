package chap11.listing10;

class Deadlock implements Runnable {
  A a = new A();
  B b = new B();
  Thread t;

  Deadlock() {
    Thread.currentThread().setName("MainThread");
    t = new Thread(this, "RacingThread");
  }

  void deadlockStart() {
    t.start();
    a.foo(b); // get lock on a in this thread.
    System.out.println("Back in main thread");
  }

  public void run() {
    b.bar(a); // get lock on b in other thread.
    System.out.println("Back in other thread");
  }

  public static void main(String args[]) {
    Deadlock dl = new Deadlock();
    
    dl.deadlockStart();
  }
}
