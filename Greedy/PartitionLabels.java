// You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

// Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

// Return a list of integers representing the size of these parts.

 

// Example 1:

// Input: s = "ababcbacadefegdehijhklij"
// Output: [9,7,8]
// Explanation:
// The partition is "ababcbaca", "defegde", "hijhklij".
// This is a partition so that each letter appears in at most one part.
// A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
// Example 2:

// Input: s = "eccbbbbdec"
// Output: [10]
 

// Constraints:

// 1 <= s.length <= 500
// s consists of lowercase English letters.


class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int[] character = new int[26];
        for(int i=0;i<s.length();i++){
            character[s.charAt(i) -'a'] = i;
        }
        // System.out.println();
        // for(int i=0;i<26;i++){
        //     System.out.print(" "+character[i]);
        // }
        
        int partitionIndex = 0; 
        int lastPartition = -1;
        List<Integer> partitionList = new ArrayList();
        
        for(int i=0;i<s.length();i++){
            partitionIndex = Math.max(partitionIndex,character[s.charAt(i) - 'a']);
            if(partitionIndex == i){
                
                partitionList.add(partitionIndex - lastPartition);
                lastPartition = partitionIndex;
                partitionIndex = 0;
            }
        }
        
        return partitionList;
    }
}
