package topic;

public class NumberGenerator {

	int num = 1;
	int threads;
	int max;

	public NumberGenerator(int max, int threads) {
		this.max = max;
		this.threads = threads;
	}

	public void getNumber(int result)  {
		synchronized (this) {
			while (num < max -1) {
				while (num % threads != result) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + num++);
				notifyAll();
			}
		}
	}
}
