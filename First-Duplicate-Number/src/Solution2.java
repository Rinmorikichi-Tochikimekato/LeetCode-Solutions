/**
 * 
 * @author mohit_nirwan
 *This solution aims to solve the problem in O(1) space, and O(n) Time
 *the solution is based on Floyd's hare and tortoise algorithm, and ia also known
 *as cycle detection algorithm, which aims to find the if there exists a cycle or not
 *and if it does,trie to find the origin of the cycle
 *
 */
class Solution2 {
    public int findDuplicate(int[] nums) {
        
        
      int h = nums[0];
      int t = nums[0];
        
        do{
            t = nums[t];
            h = nums[nums[h]];
            
        }while(t!=h);
        
        //phase 2, to find the begining of the cycle
        
        int p1 = nums[0];
        int p2 = h;
        
        while(p1!=p2){
            p1=nums[p1];
            p2=nums[p2];
        }
        
        return p1;
    }
}