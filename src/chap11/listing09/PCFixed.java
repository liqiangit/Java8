package chap11.listing09;

class PCFixed {
  public static void main(String args[]) {
    Q q = new Q();
    Producer p = new Producer(q);
    Consumer c = new Consumer(q);

    // Start the threads.
    p.t.start();
    c.t.start();

    System.out.println("Press Control-C to stop.");
  }
}
