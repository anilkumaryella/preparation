package array;

import java.math.BigInteger;

public class ExchangeValues {
	String name;

	@Override
	public String toString() {
		return "ExchangeValues [name=" + name + "]";
	}

	public static BigInteger sumWithCoefficients(final int[] values, final int[] coefficients) {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < values.length; i++) {
			sum = sum.add(BigInteger.valueOf(values[i] * coefficients[i]));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] a= {1,2};
		int[] b= {1};
		
		sumWithCoefficients(a,b);
		
	/*	Map<String, Object> collection = new TreeMap<>();

		System.out.println(
				collection.compute("foo", (k, v) -> (v == null) ? new ArrayList<Object>() : ((List) v).add("bar")));
		System.out.println(
				collection.compute("foo", (k, v) -> (v == null) ? new ArrayList<Object>() : ((List) v).add("ber")));
		
		System.out.println(collection);*/
		
		
		ExchangeValues m1 = new ExchangeValues();
		ExchangeValues m2 = new ExchangeValues();

				m1.name = m2.name = "m1";

				callMe( m1, m2 );
				System.out.println( m1 + " & " + m2 );
			}

			private static void callMe( ExchangeValues... m ) {
				m[0] = m[1];
				m[1].name = "new name";
			}

}
