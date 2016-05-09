/*
 * @(#)Solution.java	2016年5月3日
 *
 * Copyright 2015 lezhu, Inc. All rights reserved.
 */

package math.number_172;


/** 
 * <p>Solution </p>
 * TODO
 * @author Administrator
 * @date 2016年5月3日
 * @version v1.0.0.0 
 * 
 */

public class Solution {

	/** 
	 * <p> main </p>
	 * TODO
	 * @param args          
	 * @throws 
	 * @author Administrator
	 * @date 2016年5月3日
	 */
	public static void main(String[] args) {
		System.out.println(new Solution().trailingZeroes(1808548329));
		/*for(int i=1;i<10;i++){
			System.out.println(factor(i));
		}*/
	}
	
    /** 
     * <p> trailingZeroes </p>
     * 1!=1 0
     * 2!=2 0
     * 尾数为0之前
     * 1.0*any
     * 2.5*偶数
     * 1. 0
     * 2. n/10 个 0
     * 3. 90+n/100*2 + n%100
     * 4. 
     *  
     * @param n
     * @return          
     * @throws 
     * @author Administrator
     * @date 2016年5月3日
     */
    public int trailingZeroes(int n) {
    	if(n == 0)
    		return 0;
    	int result = 0;
    	int i = 2;
    	while(i*5<=n){
    		result++;
    		if(i % 5 == 0)
    			result += facOf5(i);
    		i++;
    	}
    	return result;
    }
    
    private  int facOf5(int n){
    	int count = 1;
    	n = n / 5;
    	while(n % 5 == 0){
    		count++;
    		n /= 5;
    	}
    	return 	count;
    }


}
