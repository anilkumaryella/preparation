import java.util.HashMap;
import java.util.Map;

public class D {

	public static void main(String[] args) {
		
		
		/*String data = "P-5378(Base)";
		data.replaceAll("\\D", "");
		// System.out.println(data);

		int[] ip = { 2, 7, 11, 15 };
		twoSum(ip, 9);*/
		
		int a = 100000000;
		String[] s = "21010010102".split("0", 2);
		System.out.println(s.length);
		for (String t : s) {
			System.out.println(t);
		}
	}
	
	public static int solution(int N) {
		// write your code in Java SE 8

		int count = 0;

		for (int i = 1; i <= N; i++) {
			String s = String.valueOf(i);
			count += s.split("1", -1).length - 1;
		}
		return count;

	}

	//2 4 6 8   --12
	/*public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		int[] output = new int[2];
		for (int i = 0; i < n; i++) {

			if (map.containsKey(nums[i])) {
				output[1] = i;
				output[0] = map.get(nums[i]);
				break;
			}
			map.put(target - nums[i], i);
		}
		System.out.println(output[0] + ":" + output[1]);
		return output;
	}*/
}
