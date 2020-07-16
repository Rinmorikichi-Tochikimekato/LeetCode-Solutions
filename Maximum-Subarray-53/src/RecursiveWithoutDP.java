class RecursiveWithoutDP {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int fMax = nums[0];
        
        
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],nums[i]+max);
            if(fMax<max){
            fMax=max;
            }
        }
        
        return fMax;
    }
    
}