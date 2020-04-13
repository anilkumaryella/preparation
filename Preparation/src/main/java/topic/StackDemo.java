package topic;
import java.util.Arrays;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		// default capacity 10
		//
		Stack<String> stack = new Stack<String>();
		String name = "12345";
		// push an element into stack
		stack.addAll(Arrays.asList(name.split("")));
		System.out.println(stack.capacity());
		while (!stack.isEmpty()) {
			// pop will remove an element from top and return that value
			// top will return top value
			System.out.print(stack.pop());
		}
	}
}
