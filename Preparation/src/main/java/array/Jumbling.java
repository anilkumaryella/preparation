package array;

import java.util.ArrayList;
import java.util.List;

public class Jumbling {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		 for (String userName : list)
	        {
			 
	        }
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4 };
		// int[] b = { 1, 2, 3, 4 };
		int n = a.length;
		
		for (int i = 0; i < n; i++) {
			int[] b = a.clone();
			for (int j = i + 1; j < n; j++) {
				exchangeAndPrint(b, b[i], b[j]);

			}
		}

	}


	public static void exchangeAndPrint(int[] c, int i, int j) {

		for (int k : c) {
			if (k == i)
				System.out.print(j + " ");
			else if (k == j)
				System.out.print(i + " ");
			else
				System.out.print(k + " ");
		}
		System.out.println();

	}

}
