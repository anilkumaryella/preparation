package topic;

public class SequenceGeneratorThread implements Runnable {

	NumberGenerator numberGenerator;
	int result;

	public SequenceGeneratorThread(NumberGenerator numberGenerator, int result) {
		this.numberGenerator = numberGenerator;
		this.result = result;
	}

	@Override
	public void run() {
		numberGenerator.getNumber(result);
	}

}
