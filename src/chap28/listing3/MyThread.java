package chap28.listing3;
 
class MyThread implements Runnable { 
  CountDownLatch latch; 
 
  MyThread(CountDownLatch c) { 
    latch = c; 
  } 
 
  public void run() { 
    for(int i = 0; i<5; i++) { 
      System.out.println(i); 
      latch.countDown(); // decrement count 
    } 
  } 
}
