/***
 * 
 * @author rintoshi
 * Use a map to record the occurance, and return when you a find a occurance > n/2
 */
public class Solution1 {
	
	 public int majorityElement(int[] nums) {
	     
	        Map<Integer,Integer> map = new HashMap<>();
	         int frequency = 1;
	        for(int i=0;i<nums.length;i++){
	            
	            
	           frequency = map.getOrDefault(nums[i], 0) + 1;
	            map.put(nums[i],frequency);
	            
//	             if(map.containsKey(nums[i])){
//	                 number = map.get(nums[i])+1;
//	                 map.put(nums[i], number);
	                
//	             }else{
//	                 map.put(nums[i],1);
//	             }
	            
	            if(frequency> nums.length/2)
	                {
	                    return nums[i];
	                }
	            
	            
	        }
	        

	        return -1;
	    }


}
