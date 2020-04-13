package topic;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = { 3, 5, 2, 4 };

		BitSet bs1 = new BitSet(5);
		BitSet bs2 = new BitSet(5);

		for (int i = 0; i < a.length; i++) {
			bs1.set(i);
		}
		bs1.or(bs2);

		bs1.set(2, false);

		int n = bs1.cardinality();
		for (int i = 0; i < n; i++) {

			System.out.println(i);

			i = bs1.nextSetBit(i);

			System.out.println(i);
		}

	}

}
