package math.number_326;

public class Solution {

	public static void main(String[] args) {
		//System.out.println(new Solution().isPowerOfThree(-3));
		System.out.println(0%3);
	}

    public boolean isPowerOfThree(int n) {
    	if(n == 1)
    		return  true;
    	if(n <= 0)
    		return false;
        if(n % 3 == 0)
        	return isPowerOfThree(n/3);
        return false;
    }


}
