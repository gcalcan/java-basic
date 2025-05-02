// https://www.javatpoint.com/synchronized-block-example
package gicu;

public class SynchronizedBlockExample {
	public static void main(String args[]) {
		Table2 obj = new Table2();// only one object
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2 = new MyThread4(obj);
		t1.start();
		t2.start();
	}
}

class Table1 {
//	synchronized void printTable(int n) {// synchronized method
	void printTable(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.print(n * i + " ");
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class MyThread3 extends Thread {
	Table2 t;

	MyThread3(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread4 extends Thread {
	Table2 t;

	MyThread4(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
