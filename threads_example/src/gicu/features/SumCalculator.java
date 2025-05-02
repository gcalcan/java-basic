package gicu.features;

import java.util.concurrent.*;

public class SumCalculator {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
//       Future<Integer> future = executor.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                int sum = 0;
//                for (int i = 1; i <= 100; i++) {
//                    sum += i;
//                }
//                return sum;
//            }
//        });

		Callable<Integer> doSum = new DoSum();
		Future<Integer> future = executor.submit(doSum);
		System.out.println("Waiting for the result...");
		int result = future.get();
		System.out.println("The sum of the first 100 numbers is: " + result);

		Future<Integer> future1 = executor.submit(new DoSum1(10));
		System.out.println("Waiting for the result...");
		result = future1.get();
		System.out.println("The sum of the first 10 numbers is: " + result);

		executor.shutdown();
	}
}

class DoSum implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
}

class DoSum1 implements Callable<Integer> {
	private int n;

	DoSum1(int n) {
		this.n = n;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}