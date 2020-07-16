/***
 * 
 * @author rintoshi
 * Boys Moore Algorithm implementation
 */
public class Solution2 {
	
	 public int majorityElement(int[] nums) {
	     
	        int count=1;
	        int cand = 0;
	        
	        for(int i=1;i<nums.length;i++){
	            
	            if(nums[cand]==nums[i]){
	                count++;
	            }else{
	                
	                count--;
	                if(count==0){
	                    cand = i;
	                    count = 1;
	                }
	            }
	            
	        }
	        return nums[cand];
	        
	    }

	

}
