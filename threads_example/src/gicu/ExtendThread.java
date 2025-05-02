package gicu;

public class ExtendThread extends Thread {
//	If the class extends the Thread class, the thread can be run by 
//	creating an instance of the class and call its start() method:
	
	public void run() {
		System.out.println("This code is running in a thread");
	}
	
	public static void main(String[] args) {
		ExtendThread thread = new ExtendThread();
		thread.start();
		System.out.println("This code is outside of the thread");
	}
}
