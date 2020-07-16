/**
 * 
 * @author mohit_nirwan
 * This is again a O(n) Time solution, with space complexity of O(N)
 * 
 */


import java.util.HashSet;

class Solution3Sets {
    public int findDuplicate(int[] nums) {
        
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return 0;
    }
}