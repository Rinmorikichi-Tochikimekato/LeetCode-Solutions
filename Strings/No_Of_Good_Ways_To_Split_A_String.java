class Solution {
    public int numSplits(String s) {
        int[] left = new int[s.length()];
        int[] right = new int[s.length()];
        
        Set<Character> leftS = new HashSet();
        Set<Character> rightS = new HashSet();
        
        int i=0;
        int j = s.length() - 1;
        
        while( j > 0 && i < s.length() ){
            rightS.add(s.charAt(j));
            leftS.add(s.charAt(i));
            left[i] = leftS.size();
            right[j] = rightS.size();
            j--;
            i++; 
        }
        
           
        int counter = 0;
        for(int k=0;k<s.length()-1;k++){
            if(left[k] == right[k+1]) counter++;
        }
        
        return counter;
        
    }
}
