/**
 * @author gibbonss
 *
 */
public class LargeInteger {

	/*
	 * Represents the total length of all the arrays in order to allow basic
	 * operations to be performed and have the digits line up correctly
	 */
	private static final int N = 30;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	/**
	 * Calculates the sum of two "large integers" a and b, represented as arrays of
	 * digits, with the units digit at the end of the array
	 * 
	 * @param a
	 *            the first large integer to be added
	 * @param b
	 *            the second large integer to be added
	 * @return array of N digits that represents the sum of a and b Precondition:
	 *         a.length == b.length ==N; the sum fits into N digits
	 */
	private static int[] add(int[] a, int[] b) {
		int[] result = new int[N];
		for (int i = N; i > 0; i--) {
			result[i] = (a[i] + b[i]) % 10;
			result[i - 1] = (a[i] + b[i]) / 10;

		}
		return result;

	}

	/**
	 * tests the add method as described in Chapter 9, Exercise 25, p. 264
	 * 
	 */
	/**
	 * 
	 */
	public static void test() {
		int[] a = new int[N];

		for (int i = N - 1; i > 0; i--) {
			a[i] = (int) Math.random() * 9 + 1;
		}
		int[] b = new int[N];

		for (int i = N - 1; i > 0; i--) {
			a[i] = (int) Math.random() * 9 + 1;

		}
		int[] sum = add(a, b);
		
		System.out.print("The sum of ");
		for(int i)
	}
}
