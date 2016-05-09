/*
 * @(#)Solution.java	2016年5月9日
 *
 * Copyright 2015 lezhu, Inc. All rights reserved.
 */

package math.number_9;

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
     * 
     * 覆盖率:
     * 1.长度为1
     * 1,-1
     * 2.长度大于或者等于1
     * ['a','b','b','a']
     * <p> isPalindrome </p>
     * TODO
     * @param x
     * @return          
     * @throws 
     * @author Administrator
     * @date 2016年5月9日
     */
    public boolean isPalindrome(int x) {
        if(x < 0){
        	return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        int startIndex = 0;
        int endIndex = sb.length() - 1;
        while(startIndex < endIndex){
        	if(sb.charAt(startIndex) != sb.charAt(endIndex)){
        		return false;
        	}
        	startIndex ++;
    		endIndex --;
        }
        return true;
    }

    
    public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(-2147447412));
	}
}
