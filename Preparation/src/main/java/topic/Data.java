package topic;

public class Data {

	int i = 0;

	public synchronized void getNum() throws InterruptedException {
boolean isPrint = false;
		while (true) {
			if(isPrint)
			wait();
			int curr = this.i++;
			Thread.sleep(1000);
			System.out.println(curr);
			isPrint = true;
			notify();
		}
	}
}
