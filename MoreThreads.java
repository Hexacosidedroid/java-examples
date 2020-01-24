class MyThread implements Runnable {
	Thread thrd;

	MyThread(String name) {
		thrd = new Thread(this, name);
		thrd.start();
	}

	public void run() {
		System.out.println(thrd.getName() + " - activate");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + " counter: " + count);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " - closed");
		}
		System.out.println(thrd.getName() + " - ended");
	}
}

class MoreThreads {
	public static void main(String[] args) {
		System.out.println("Activate of first Thread");

		MyThread mt1 = new MyThread("Child1");
		MyThread mt2 = new MyThread("Child2");
		MyThread mt3 = new MyThread("Child3");

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException exc) {
				System.out.println(" - closed");
			}
		}
		while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
		System.out.println("Deactivate of first Thread");
	}
}