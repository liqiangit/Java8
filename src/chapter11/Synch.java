package chapter11;

/**
 * p253 使用同步方法 synchronized
 * @author marsamoeba
 *
 */
class Callme {
	// 添加同步方法 保证资源同步  
	synchronized void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
			e.printStackTrace();
		}
		 System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;
	
	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		target.call(msg);
	}
	
}


class Synch {
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
	    Caller ob2 = new Caller(target, "Synchronized");
	    Caller ob3 = new Caller(target, "World");
	    
	    try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
			e.printStackTrace();
		}
	}

}
