class Solution {
    public static int jump(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
       
        int i=0,j,num=0,count=0,iterIndex=0;
        
           while(i<nums.length-1){
               count=count+1;
               
            for(j=1;j<=nums[i];j++){
                
                 if(num<=(j+nums[j])){
                     num = j+nums[j];
                     iterIndex = j;
                 }
                    if(num >= nums.length-1){
                        break;
                    }
            }
            num =0;
          
            	
         } 
        
     return count;   
    }
    
    
    public static void main(String[] args) {
		int[] arr = {2,3,1,1,5};
		int count = jump(arr);
		System.out.println(count);
	}
}