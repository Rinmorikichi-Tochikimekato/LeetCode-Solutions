class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 ;
        
        int n=prices.length;
        for(int i=1;i<n;i++){
            max = Math.max(max, max+(prices[i]-prices[i-1]));
            
        }
        return max;
    }
}