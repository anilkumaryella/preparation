package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Router {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> links = new ArrayList<ArrayList<Integer>>();

		criticalRouters(7, 7, links);
	}

	public static List<Integer> criticalRouters(int numRouters, int numLinks, ArrayList<ArrayList<Integer>> links) {
		// WRITE YOUR CODE HERE

		Map<Integer, Boolean> map = new HashMap<>();
		
		for (int i = 1; i <= numRouters; i++) {

			if (!links.get(i).contains(i)) {

			}
		}

		return new ArrayList<>();
	}

}
