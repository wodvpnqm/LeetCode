/*
 * @(#)Solution.java	2016年5月9日
 *
 * Copyright 2015 lezhu, Inc. All rights reserved.
 */

package math.number_7;

/** 
 * <p>Solution </p>
 * TODO
 * @author Administrator
 * @date 2016年5月9日
 * @version v1.0.0.0 
 * 
 */

public class Solution {

    /** 
     * 翻转整数
     * 1.10 -> 01
     * 2.溢出
     * 3.负数
     * 4.0
     * 12
     * 21
     * 
     * 168
     * 861
     * 1.不考虑结尾的0和溢出的情况
     * <p> reverse </p>
     * TODO
     * @param x
     * @return          
     * @throws 
     * @author Administrator
     * @date 2016年5月9日
     */
    public int reverse(int x) {
    	long target = Math.abs((long)x);
    	String strInt = new StringBuilder(""+target).reverse().toString();
    	long result = Long.valueOf(strInt);
    	if(x < 0 && result >= Math.abs((long)Integer.MIN_VALUE))
    		return 0;
    	if(x > 0 && result > Integer.MAX_VALUE)
    		return 0;
        return x >= 0?Integer.valueOf(strInt):-Integer.valueOf(strInt);
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().reverse(-123));
	}
}
