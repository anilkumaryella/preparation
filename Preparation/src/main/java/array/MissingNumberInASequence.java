package array;

public class MissingNumberInASequence

{
	public static void main(String args[]) {

		int[] a = { 3, 5, 1, 2 };

		System.out.println(getMissingNumber(a, 5));
	}

	void add() {
	}

	/**
	 * Java method to find missing number in array of size n containing numbers
	 * from 1 to n only. can be used to find missing elements on integer array
	 * of numbers from 1 to 100 or 1 - 1000
	 */
	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}

		return expectedSum - actualSum;
	}

}
