package math.number_204;


public class Solution {
	
	
    public int countPrimes(int n) {
        //2,3,5,7,11,13,17 
        //20  5
        //init check  n
        boolean[] a = new boolean[n];
        //
        for(int i=2; i*i<n; i++) {
           if(!a[i]) {
               for(int j=i; i*j<n; j++) {
                   a[i*j] = true;
               }
           }
        }
        int c=0;
        
        for(int i=2; i<n; i++) {
            if(a[i] == false) ++c;
        }
        return c;
      }
    
	public static void main(String[] args) {
		System.out.println(new Solution().countPrimes(4));
	}
	
}
