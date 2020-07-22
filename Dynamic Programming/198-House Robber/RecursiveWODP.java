
//Recursive without dp tle

class Solution {
   
    public int rob(int[] nums) {
        return helper(nums,nums.length-1);
    }
    
    int helper(int[] nums,int i){

        if(i<0) return 0;
    
        return Math.max( helper(nums,i-1) , ( helper(nums,i-2) + nums[i]) );
    }
}