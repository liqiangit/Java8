package chapter11;

/**
 * p243 主线程
 * @author marsamoeba
 *
 */
// Controlling the main Thread.
class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		
		// 修改线程名称
		t.setName("My Thread");
		System.out.println("After name change: " + t);
		
		for (int n = 5; n > 0; n--) {
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
