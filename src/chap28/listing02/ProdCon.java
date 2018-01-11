package chap28.listing02;
 
class ProdCon { 
  public static void main(String args[]) { 
    Q q = new Q(); 

    new Thread(new Consumer(q), "Consumer").start();
    new Thread(new Producer(q), "Producer").start();
  } 
}
