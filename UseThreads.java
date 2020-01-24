class MyThread implements Runnable {
	String thrdName;

	MyThread(String name) {
		thrdName = name;
	}

	public void run() {
		System.out.println(thrdName + " - activated");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName + ", counter: " + count);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(thrdName + " - deactivated");
		}
		System.out.println(thrdName + " - off");
	}
}

class UseThreads {
	public static void main(String[] args) {
		System.out.println("Enable of main thread");

		MyThread mt = new MyThread("Child #1");

		Thread newThrd = new Thread(mt);

		newThrd.start();

		for (int i=0; i<50; i++) {
			System.out.println(".");
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