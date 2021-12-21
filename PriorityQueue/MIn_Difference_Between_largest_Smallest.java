class Solution {
    public int minDifference(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length-1;
//         int res = Integer.MAX_VALUE;
//         if(nums.length<5) return 0;
        
//         //remove either 3 from right, or 3 from the left and compare the max and min from the residue values
//        int min1 =  Math.min(nums[n] - nums[3], nums[n-3] - nums[0]);
        
//         //remove either 2 from left, 1 from right or remove 2 from right and 1 from left, and compare the residue
        
//         int min2 =  Math.min(nums[n-2] - nums[1], nums[n-1] - nums[2]);
        
//         // return Math.min(min1,min2);

        
//         //looping to get the same annswer
        
//         for(int i=0;i<4;i++){
//             res = Math.min(res, nums[n - 3 + i] - nums[i]);
//         }
    
        
        // Priority Queue Solution Time - O(nLog(k)) k = 4 here
        // Effective time - O(n)
        
        
      PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
      PriorityQueue<Integer> minHeap = new PriorityQueue();
        
     int heapRes = Integer.MAX_VALUE;
        
     for(int i=0;i<nums.length;i++){
         maxHeap.add(nums[i]);
         minHeap.add(nums[i]);
         if(maxHeap.size() > 4) maxHeap.poll();
         if(minHeap.size() > 4) minHeap.poll();
     }
        
        // System.out.println("maxHeap = " + maxHeap + "minHeap = " + minHeap);
        
        List<Integer> minList = new ArrayList();
        
        while(minHeap.size()!=0){
            minList.add(minHeap.poll());
        }
        
        // System.out.println(minList);
        
        for(int i = minList.size() - 1; i>=0; i--){
            heapRes = Math.min(heapRes, minList.get(i) - maxHeap.poll());
        }
        
        // System.out.println(heapRes);
        return heapRes;
        
    }
}
