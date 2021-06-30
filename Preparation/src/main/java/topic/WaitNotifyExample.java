package topic;

public class WaitNotifyExample {

	Data data = new Data();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Data data = new Data();
		Thread t1 = new Thread(new Thread1(data));
		Thread t2 = new Thread(new Thread1(data));
		t1.start();
		t2.start();
	}

}
