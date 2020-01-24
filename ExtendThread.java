class MyThreads extends Thread {

	MyThreads(String name) {
		super(name);
		start();
	}

	public void run() {
		System.out.println(getName() + " - activated");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", counter: " + count);
			}
		}
		catch (InterruptedException exc) {
			System.out.println(getName() + " - deactivated");
		}
		System.out.println(getName() + " - off");
	}
}

class ExtendThread {
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