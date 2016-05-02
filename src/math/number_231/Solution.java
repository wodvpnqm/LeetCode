package math.number_231;

public class Solution {

	public static void main(String[] args) {
		//System.out.println(new Solution().isPowerOfTwo(3));
		System.out.println(Math.pow(0, 2));
		/*System.out.println(Integer.toHexString(0x40000000));
		for(int i = 0x40000000;i>0;i=i>>1){
			System.out.println(Integer.toHexString(i));
		}*/
	}

	/**
	 * java整数的范围:0~FFFFFFFF
	 * 0x0~0xFFFFFFFF
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
	}

}
