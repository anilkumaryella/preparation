package array;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			// Pick ending point
			for (int j = i; j < n; j++) {
				// Print subarray between current starting
				// and ending points
				for (int k = i; k <= j; k++)
					System.out.print(arr[k] + " ");
				System.out.println();
			}
		}

	}

}
