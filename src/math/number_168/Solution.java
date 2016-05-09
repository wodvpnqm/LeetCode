/*
 * @(#)Solution.java	2016年5月3日
 *
 * Copyright 2015 lezhu, Inc. All rights reserved.
 */

package math.number_168;


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
		System.out.println(new Solution().titleToNumber("Z"));
	}
	

    /** 
     *        A -> 1
     *        B -> 2
     *        C -> 3
     *        ...
     *        Z -> 26
     *        AA -> 27
     *        AB -> 28 
     * @date 2016年5月4日
     */
    public int titleToNumber(String s) {
    	int [] table = new int[128];
    	//{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
    	for(int i='A';i<='Z';i++){
    		table[i] = i-'A'+1;
    	}
    	int sum = 0;
        for(int i=s.length()-1;i>=0;i--){
        	sum += table[s.charAt(i)]*Math.pow(26,s.length()-i-1);
        }
        return sum;
    }


}
