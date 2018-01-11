package chap11.listing08;

class Consumer implements Runnable {
  Q q;
  Thread t;

  Consumer(Q q) {
    this.q = q;
    t = new Thread(this, "Consumer");
  }

  public void run() {
    while(true) {
      q.get();
    }
  }
}
