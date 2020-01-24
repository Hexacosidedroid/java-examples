class Queue1 {
	private char q[];
	private int putloc, getloc;

	Queue1(int size) {
		q=new char[size+1];
		putloc=getloc=0;
	}

	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue full");
			return;
		}
		putloc++;
		q[putloc]=ch;
	}

	char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue empty")
		}
	}
}