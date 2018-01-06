package chapter11;

/**
 * p250  Thread的 isAlive和join方法
 * @author marsamoeba
 *
 */
// Using join() to wait for threads to finish.
class NewThread4 implements Runnable {
	String name;
	Thread t;
	
	NewThread4(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			 System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
	
}

class DemoJoin {
	public static void main(String[] args) {
		NewThread4 ob1 = new NewThread4("One");
	    NewThread4 ob2 = new NewThread4("Two");
	    NewThread4 ob3 = new NewThread4("Three");
	    
	    System.out.println("Thread One is alive: " + ob1.t.isAlive());
	    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
	    System.out.println("Thread Three is alive: " + ob3.t.isAlive());
	    try {
	    	System.out.println("Waiting for threads to finish.");
	    	ob1.t.join();
	    	ob2.t.join();
	    	ob3.t.join();
    	} catch (InterruptedException e) {
    	    System.out.println("Main thread Interrupted");
    	}
	    
	    System.out.println("Thread One is alive: " + ob1.t.isAlive());
	    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
	    System.out.println("Thread Three is alive: " + ob3.t.isAlive());
	    System.out.println("Main thread exiting.");
	}
	
}
