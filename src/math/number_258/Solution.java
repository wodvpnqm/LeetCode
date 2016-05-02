package math.number_258;

public class Solution {

	public static void main(String[] args) {
		// System.out.println(new Solution().isPowerOfThree(-3));
		System.out.println(0 % 3);
	}
    public int addDigits1(int num) {
        if(num < 10)
        	return num;
        int sum = 0;
        while(num>=10){
        	sum +=  num % 10 ;
        	num /= 10;
        }
        return 	addDigits(num+sum);
    }
    
    public int addDigits(int num) {
        if(num < 10)
        	return num;
        int sum = 0;
        while(num>=10){
        	sum +=  num % 10 ;
        	num /= 10;
        }
        return 	addDigits(sum+sum);
    }
    
/*    public int addDigits(int num){
    	if(num < 10)
        	return num;
    	String sb = ""+num; 
    	int result =  0;
    	for(int  i=0,length = sb.length();i<length;i++)
    	{
    		result += (sb.charAt(i) - '0');
    	}
    	sb =  null;
    	return addDigits(result);
    }*/
}
