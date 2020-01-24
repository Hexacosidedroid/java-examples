class MyThreads implements Runnable {
	Thread thrd;

	MyThreads(String name) {
		thrd = new Thread(this, name);
		thrd.start();
	}

	public void run() {
		System.out.println(thrd.getName() + " - activated");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", counter: " + count);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " - deactivated");
		}
		System.out.println(thrd.getName() + " - off");
	}
}

class UseThreadsImproved {
	public static void main(String[] args) {
		System.out.println("Enable of main thread");

		MyThreads mt = new MyThreads("Child #1");

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException exc) {
				System.out.println("disconnect of main thread");
			}
		}
		System.out.println("deactivated of main thread");
	}
}