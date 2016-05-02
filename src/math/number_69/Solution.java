package math.number_69;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().mySqrt(16));
	}

	public int mySqrt(int x) {
		assert  x  >=  0:"x 必须大于等于0";
		double x0 = 1.0d;
		while (Math.abs(x0 * x0 - x) >= 0.1) {
			x0 = (1.0 / 2) * (x0 + x / x0);
		}
		return (int) x0;
	}

}
