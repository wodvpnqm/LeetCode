package math.number_50;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().myPow(1,1));
	}

    /**
     * 求x^n次方
     * 1.n为奇数
     *  result = x^((n-1)/2^2*x
     * 2.n为偶数 
     *  result = (x^(n/2))^2
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
    	return myPow(x,(long)n);
    }
    
    public double myPow(double x,long n){
        //assert n>=0:"n必须大于或者 等于0";
    	if(n == 0)
    		return 1;
        if(n ==  1)
        	return x;
        if(n <  0)
        	return  1/myPow(x,-n);
        double result = 0.0d;
        if(n % 2 == 1){
        	result = myPow(x,(n-1)/2);
        	return  result*result*x;
        }else{
        	result = myPow(x,n/2);
        	return  result*result;
        }
    
    }

}
