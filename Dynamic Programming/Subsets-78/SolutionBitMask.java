class Solution {
    List<List<Integer>> output = new ArrayList();
    int n;
    public List<List<Integer>> subsets(int[] nums) {
      n = nums.length;
        int nthBit = 1 << n;
for (int i = 0; i < (int)Math.pow(2, n); ++i) {
    // generate bitmask, from 0..00 to 1..11
    String bitmask = Integer.toBinaryString(i | nthBit).substring(1);
    List<Integer> list = new ArrayList();
     for(int c=0;c<bitmask.length();c++){
         if(bitmask.charAt(c)=='1'){
             list.add(nums[c]);
         }
     }
    output.add(list);
    }   
         return output;

    }
   }