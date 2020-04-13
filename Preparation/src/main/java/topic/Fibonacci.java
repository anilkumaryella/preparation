package topic;

public class Fibonacci {

	public static void main(String[] args) {

		int start1 = 1, start2 = 1;
		int num = 1;
		int limit = 100;
		while (num < limit) {
			num = start1 + start2;
			System.out.print(num + " ");
			start1 = start2;
			start2 = num;
		}
	}
}
