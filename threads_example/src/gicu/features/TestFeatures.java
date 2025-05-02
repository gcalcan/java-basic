package gicu.features;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class TestFeatures {
	
	public static void main (String[] args) throws InterruptedException, ExecutionException {
//		Future<Integer> future = new SquareCalculator().calculate(10); //sau
		SquareCalculator calculator = new SquareCalculator();
		Future<Integer> future = calculator.calculate(10);

		while(!future.isDone()) {
		    System.out.println("Calculating...");
		    Thread.sleep(300);
		}

		Integer result = future.get();
		System.out.println("Thread finished with result: " + result);
		
		calculator.shutdown();
	}
}
