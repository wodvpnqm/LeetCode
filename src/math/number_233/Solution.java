package math.number_233;

public class Solution {

	public static void main(String[] args) {
		 System.out.println(new Solution().computeArea(-5,-3,3,0,-3,-3,3,3));
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
    	double area1 = (C-A)*(D-B);
    	double area2 = (G-E)*(H-F);
    	if(area1 == 0)
    		return (int)area2;
    	if(area2 == 0)
    		return (int)area1;
    	double areaTotal = 0;
    	double insertX = 0;
    	double insertY = 0;
        //第一个矩形中心 x坐标
        double c1x = (A+C)/2.0;
        //第一个矩形中心y坐标
        double c1y = (B+D)/2.0;
        //第二矩形中心x坐标
        double c2x = (E+G)/2.0;
        //第二矩形中心y坐标
        double c2y = (F+H)/2;
        
        
        //第一个矩形高的一半
        double edge1Y = (D-B)/2.0;
        //第二个矩形高的一半
        double edge2Y = (H-F)/2.0;
        //第一个矩形宽的一半
        double edge1X = (C-A)/2.0;
        //第二个矩形宽的一半
        double edge2X = (G-E)/2.0;
        
        //相切的时候的中心距离在y轴上的投影
        double dy = Math.abs(c2y - c1y);
        //相切的时候的中心距离在x轴上的投影
        double dx = Math.abs(c2x - c1x);
        
        //实际中心距离在y轴上的投影
        double innerDy = Math.abs(edge1Y - edge2Y);
        //实际中心距离在x轴上的投影
        double innerDx = Math.abs(edge1X - edge2X);
        
        
        if(dy <= innerDy  && dx <= innerDx ){
        	areaTotal = Math.max(area1, area2);
        }else if((dy >= edge1Y + edge2Y) || (dx >= edge1X + edge2X)){
        	areaTotal = area1 + area2;
        }else{
        	if(dx <= innerDx)
        		insertY = 2*Math.min(edge1Y, edge2Y);
        	else
        		insertY = edge1Y + edge2Y - dy;
        	if(dy <= innerDy)
        		insertX = 2*Math.min(edge1X, edge2X);
        	else
        		insertX =  edge1X + edge2X - dx;
        	return (int)(area1 + area2 -insertX*insertY);
        }
        return (int)areaTotal;
    }

}
