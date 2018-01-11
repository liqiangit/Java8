package chap28.listing08;
 
class MyThread implements Runnable { 
  String name; 
  CountDownLatch latch; 
 
  MyThread(CountDownLatch c, String n) { 
    latch = c; 
    name = n; 
  } 
 
  public void run() { 
     
    for(int i = 0; i < 5; i++) { 
      System.out.println(name + ": " + i); 
      latch.countDown(); 
    } 
  } 
}
