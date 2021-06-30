package topic;

public class SequenceNumberGenerator {

	public static void main(String[] args) {

		NumberGenerator numerGenerator = new NumberGenerator(20, 3);

		SequenceGeneratorThread thread1 = new SequenceGeneratorThread(numerGenerator, 1);
		SequenceGeneratorThread thread2 = new SequenceGeneratorThread(numerGenerator, 2);
		SequenceGeneratorThread thread3 = new SequenceGeneratorThread(numerGenerator, 0);

		new Thread(thread1,"Thread 1:").start();
		new Thread(thread2,"Thread 2:").start();
		new Thread(thread3,"Thread 3:").start();

	}

}
