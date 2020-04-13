package strings;

public class StringsClass {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 3, 7, 8, 6, 4 };
		minimumBribes(a);

	}

	static void minimumBribes(int[] q) {
		int size = q.length;
		int count = 0;
		int[] b = new int[size];

		for (int z = 1; z <= size; z++) {
			b[z - 1] = z;
		}
		boolean isChaos = false;
		int i = size;
		while (i > 0) {
			if (i == q[i - 1]) {
				i--;
				continue;
			} else if (i == q[i - 2]) {
				if (q[i - 1] != i - 1) {
					isChaos = true;
					System.out.println("Too chaotic");
					break;
				}
				i = i - 2;
				count = count + 1;
			} else if (i == q[i - 3]) {

				if (q[i - 1] != i - 1 || q[i - 2] != i - 2) {
					isChaos = true;
					System.out.println("Too chaotic");
					break;
				}
				i = i - 3;
				count = count + 2;

			} else {
				isChaos = true;
				System.out.println("Too chaotic");
				break;
			}
		}
		if (!isChaos) {
			System.out.println(count);
		}
	}

}
