package chapter11;

/**
 * p248 创建多个线程 
 * @author marsamoeba
 *
 */
class NewThread3 implements Runnable {
	String name;
	Thread t;
	
	NewThread3(String threadname) {
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


class MultiThreadDemo {
	public static void main(String[] args) {
		new NewThread3("One");
		new NewThread3("Two");
		new NewThread3("Three");
		
		try {
			// 可用.join() 来控制确保主线程最后结束
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Main thread exiting.");
	}
	
}
