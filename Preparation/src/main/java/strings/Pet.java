package strings;

public class Pet {

	public static void main(String[] arr) {

		int[] A = new int[] { 1, 3, 5, 3, 8, 2, 6, 7, 6, 8, 9 };
		int jumps = 0, curEnd = 0, curFarthest = 0;
		for (int i = 0; i < A.length - 1; i++) {
			curFarthest = Math.max(curFarthest, i + A[i]);
			if (i == curEnd) {
				jumps++;
				curEnd = curFarthest;
			}
		}
		System.out.println(jumps);

	}
}
