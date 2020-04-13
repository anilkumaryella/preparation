package topic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable<String> {

	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		//System.out.println(Thread.currentThread().getName() + ":call");
		return "Call return value";
	}

	public static void main(String args[]) {
		// ExecutorService exec = Executors.newSingleThreadExecutor();

		ExecutorService ex = Executors.newFixedThreadPool(3);

		List<Future<String>> lf = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			lf.add(ex.submit(new CallableDemo()));
		}

		// Future<String> f = exec.submit(new CallableDemo());

		// System.out.println(lf.get(0).isDone());

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(lf.get(i).get());
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}
}
