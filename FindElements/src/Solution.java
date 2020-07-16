
/***
 * @author Mohit Nirwan
 * This solution would work for both the N*N & M*N array sizes. 
 * The space Complexity is O(M+N) || O(2N)
 * the time compexity is O(M*N)
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> findElements(int[][] arr) {

        List<List<Integer>> list = new ArrayList<>();
        
        int m = arr.length;
        int n = arr[0].length;
        
        int[] row = new int[m];
        int[] col = new int[n];

        
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                row[i] += arr[i][j];
                
                col[j] += arr[i][j];
            }
        }
        
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
               
                if(row[i]==col[j]){
                    
                    List<Integer> listn = new ArrayList<>();
                    listn.add(i);
                    listn.add(j);
                    list.add( listn );
                    
                }
            }
        }
        
       // System.out.println(list);
        
        return list;
    }
    
    public static void main(String[] args) {
    	int[][]  arr = {{1,8,4,2,4},{9,0,3,5,9},{2,5,4,9,4},{0,8,1,5,6},{1,7,0,3,3}};
        List<List<Integer>> list = findElements(arr);
        System.out.println(list);
		
	}
}