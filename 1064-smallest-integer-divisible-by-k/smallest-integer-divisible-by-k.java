class Solution {
    public int smallestRepunitDivByK(int k) {
        int max = Integer.MAX_VALUE ;
        int n = 0 ;
        int count = 1 ;
        if( k == 2 || k == 5){
            return -1 ;
        }
        while(count <= k){
            n = (n * 10 + 1) % k ;
            if(n == 0){
                return count;
            }
              count++;
        }
        return -1 ;
    }
}