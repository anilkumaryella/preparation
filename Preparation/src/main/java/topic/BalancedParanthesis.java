package topic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {

		BalancedParanthesis b = new BalancedParanthesis();
		b.checkBalance();
	}

	public void checkBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Expression !!!");
		String s = sc.nextLine();

		String[] str = s.split("");

		Stack<String> stack = new Stack<String>();

		Map<String, String> map = new HashMap<String, String>();

		map.put(")", "(");
		map.put("}", "{");
		map.put("]", "[");
		boolean isValid = false;
		int count = 0;
		for (String sub : str) {
			if (sub.equals("(") || sub.equals("{") || sub.equals("[")) {
				count++;
				stack.push(sub);
			} else if (sub.equals(")") || sub.equals("}") || sub.equals("]")) {
				count++;
				if (!stack.isEmpty()) {

					isValid = validateExpression(map, stack.pop(), sub);
				} else {
					System.out.println("Not an expression");
				}
			}

		}

		if (!isValid || count % 2 != 0) {
			System.out.println("Not Matching");
		} else
			System.out.println("Matching");

		sc.close();

	}

	private static boolean validateExpression(Map<String, String> map, String pop, String str) {
		// TODO Auto-generated method stub

		if (!(map.get(str).equals(pop))) {
			return false;
		} else
			return true;

	}

}
