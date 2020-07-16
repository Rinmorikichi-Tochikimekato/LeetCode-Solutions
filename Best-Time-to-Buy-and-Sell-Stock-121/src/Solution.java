/**
 * 
 * @author mohit_nirwan
 *Brute force approach to solve the problem, which factors in maximum profit for a element
 */
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int b,profit=0;
        
        
        for(int i=0;i<prices.length;i++){
            b=prices[i];            
            
            for(int j=i+1;j<prices.length;j++){    
                    profit = Math.max(profit,prices[j]-b);
            }
        } 
        return profit;
        
    }
}