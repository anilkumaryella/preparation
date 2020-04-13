package array;

public class Island {

	public static void main(String[] args) {

		int m[][] = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };

		int rows = m.length;
		int columns = m[0].length;

		boolean v[][] = new boolean[rows][columns];

		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (m[i][j] == 1 && !v[i][j]) {
					depthFirstSearch(m, v, i, j);
					++count;
				}
			}
		}

		System.out.println(count);
		// TODO Auto-generated method stub

	}

	public static void depthFirstSearch(int[][] m, boolean[][] v, int i, int j) {

		int r[][] = new int[][] { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 },
				{ 1, -1 } };

				v[i][j] = true;

		for (int k = 0; k < 8; k++) {
			int ni = i + r[k][0];
			int nj = j + r[k][1];

			if (isSafe(ni, nj, m) && m[ni][nj] == 1 &&!v[ni][nj]) {
				depthFirstSearch(m, v, ni, nj);
				v[ni][nj] = true;
			}
			else{
				continue;
			}
		}
	}

	private static boolean isSafe(int i, int j, int[][] m) {

		if (i < 0 || j < 0 || i >= m.length || j >= m[0].length)
			return false;
		return true;
	}

}
