/*
 * @(#)Solution.java	2016年5月3日
 *
 * Copyright 2015 lezhu, Inc. All rights reserved.
 */

package math.number_202;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println(new Solution().isHappy(19));
	}
	
    /** 
     * <p> isHappy </p>
     * TODO
     * @param n
     * @return          
     * @throws 
     * @author Administrator
     * @date 2016年5月3日
     */
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        //list.add(n);
        int sum = 0;
        while(!list.contains(n)){
        	if(n == 1)
        		return true;
        	list.add(n);
        	while(n>0){
            	sum += Math.pow(n%10, 2);
            	n /= 10;
            }
        	n = sum;
        	sum = 0;
        }
        return false;
    }

}
