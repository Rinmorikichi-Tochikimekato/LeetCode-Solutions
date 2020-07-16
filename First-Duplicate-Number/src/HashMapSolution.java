import java.util.HashMap;
import java.util.Map;

class HashMapSolution {
    public int findDuplicate(int[] nums) {
        
        
    
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            //System.out.println(nums[i]);
            
            if(map.containsKey(nums[i])){
                return nums[map.get(nums[i])];
            }else{
                map.put(nums[i],i);
               // System.out.println(map);
            }
        }
        
        return 0;
    }
}