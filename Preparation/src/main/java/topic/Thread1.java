package topic;

public class Thread1 implements Runnable{
	Data data;

	public Thread1(Data data) throws InterruptedException {
		this .data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			data.getNum();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
