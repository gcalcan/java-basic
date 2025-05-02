// https://www.javatpoint.com/synchronization-in-java
package gicu;

public class SynchronizedMethodExample {
	public static void main(String args[]) {
		Table2 obj = new Table2();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}

/*
 * unsynchronized output: 100 5 200 10 300 15 20 400 25 500 synchronized output:
 * 5 10 15 20 25 100 200 300 400 500
 */

class Table {
//	void printTable(int n){// method not synchronized
//	When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
	synchronized void printTable(int n) {// synchronized method
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

class MyThread1 extends Thread {
	Table2 t;

	MyThread1(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table2 t;

	MyThread2(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
