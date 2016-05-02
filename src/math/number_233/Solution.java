package math.number_233;

public class Solution {

	public static void main(String[] args) {
		 System.out.println(new Solution().computeArea(-2,-2,2,2,-3,-3,3,1));
		//System.out.println(0 % 3);
	}
    /**
     * 求矩形的面积
     * 分 三种情况
     * 1.相离,两个矩形 没有交集 
     * 2.相交,有有一个公共矩形
     * 3.内接,一个矩形在另一个矩形内部
     * 
     * @param A
     * @param B
     * @param C
     * @param D
     * @param E
     * @param F
     * @param G
     * @param H
     * @return
     */
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int blx = Math.max(A, E);
        int bly = Math.max(B, F);
        int rtx = Math.min(C, G);
        int rty = Math.min(D, H);
        int res = (C-A) * (D-B) + (G-E) * (H-F);
        if(blx >= rtx || bly >= rty) return res;
        return res - (rtx - blx) * (rty - bly);
    }

}
