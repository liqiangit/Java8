package chapter11;

/**
 * p247 继承Thread类 创建多线程
 * @author marsamoeba
 *
 */
class NewThread2 extends Thread {
	NewThread2() {
		super("Demo Thread");
	    System.out.println("Child thread: " + this);
	    start();
	}
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
}

class ExtendThread {
	public static void main(String[] args) {
		new NewThread2();
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		    System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}
