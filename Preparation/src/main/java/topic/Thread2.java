package topic;

public class Thread2 implements Runnable {
	Data data;

	public Thread2(Data data) throws InterruptedException {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			data.getNum();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
