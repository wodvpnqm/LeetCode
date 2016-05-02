package math.number_66;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().plusOne(new int[]{9,9,9}));
	}
	
	public int[] plusOne(int[] digits) {
		int  overFlow = 1;
		int result  =  0;
		int index = digits.length-1;
		for(;index>=0;index--)
		{
			result = (digits[index] + overFlow);
			if(result < 10){
				overFlow = 0;
				digits[index] = result;
				return  digits;
			}else{
				overFlow = 1;
				digits[index] = result - 10;
			}
		}
		int []  newArray = new int[digits.length + 1];
		newArray[0] = 1;
		System.arraycopy(digits, 0, newArray, 1, digits.length);
		return newArray;
			
    }

}
