// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

 

// Example 1:

// Input: piles = [3,6,7,11], h = 8
// Output: 4
// Example 2:

// Input: piles = [30,11,23,4,20], h = 5
// Output: 30
// Example 3:

// Input: piles = [30,11,23,4,20], h = 6
// Output: 23
 

// Constraints:

// 1 <= piles.length <= 104
// piles.length <= h <= 109
// 1 <= piles[i] <= 109

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int maxP = findMax(piles);
       int l = 1;
       int r = maxP;
        
       while(l<=r){
           int mid = l + (r-l) / 2;
           if(canEat(mid,piles,h)){
               r=mid-1;
           }else{
               l=mid+1;
           }
          
       }
        return l;
    }
    
    public boolean canEat(int mid, int[] piles, int h){
        int total = 0;
        for(int pile:piles){
            total += pile/mid;
            if(pile%mid != 0) total++;
        }
        // System.out.println("H = " + h + " mid = " + mid + " total = "+ total);
        return total <= h; 
       
    }
    
    public int findMax(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int pile:piles){
            if(pile > max) max = pile;
        }
        return max;
    }
}
