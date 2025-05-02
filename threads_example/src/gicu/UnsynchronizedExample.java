package gicu;

public class UnsynchronizedExample extends Thread{

	public static int amount = 0;
	
	public static void main(String[] args) {
		UnsynchronizedExample thread = new UnsynchronizedExample();
		thread.start();
		System.out.println(amount);

		amount++;
		System.out.println(amount);
	}
	
	public void run() {
	    amount++;
	  }
}
