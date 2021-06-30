package strings;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	public static void main(String[] args) {

		String input = "321";
		String[] sArr = input.split("");
		int arr[] = new int[sArr.length];

		for (int i = 0; i < sArr.length; i++) {
			arr[i] = Integer.valueOf(sArr[i]);
		}

		int n = arr.length;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				String temp = "";

				for (int k = i; k <= j; k++)
					temp += arr[k];
				list.add(temp);

			}

		}

		int total = 0;
		for (String s : list) {
			total += Integer.valueOf(s);
		}
		System.out.println(total);

	}
}
