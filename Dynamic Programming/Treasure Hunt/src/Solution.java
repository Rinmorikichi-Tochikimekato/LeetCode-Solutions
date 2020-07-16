
public class Solution {

	
	static	void getTreasure(char[][] arr) {
		
		 int r = arr.length;
		 int c = r==0 ? 0: arr[0].length;
		
		 helper(arr,0,0,0);
		 
	}
	
	static void helper(char[][] arr,int i,int j, int sum) {
		//System.out.println(i+" "+j);

		 int r = arr.length;
		 int c = r==0 ? 0 : arr[0].length;
		 
		 char change = arr[i][j];
		 
		 if(arr[i][j]=='X') {
			 fin = Math.min(fin, sum);
			 
			 //System.out.println(sum);
			 
		 }
		 
		 arr[i][j] = 'D';
		 
		 if(i+1<r && arr[i+1][j]!='D') {
			 helper(arr,i+1,j,sum+1);
		 }
		 if(j+1<c && arr[i][j+1]!='D') {
			 helper(arr,i,j+1,sum+1);
		 }
		 if(i-1>=0 && arr[i-1][j]!='D') {
			 helper(arr,i-1,j,sum+1);
		 }
		 if(j-1>=0 && arr[i][j-1]!='D') {
			 helper(arr,i,j-1,sum+1);
		 }
		 
		 arr[i][j]=change;
		 
		return ;
	}
	
	static int fin=Integer.MAX_VALUE;
	
	public static void main(String[] args) {
//		System.out.println("hi");
		
		char[][] arr = {{'O', 'O', 'O', 'O'},{'D', 'O', 'D', 'O'},
				{'O', 'O', 'O', 'O'},
				{'O', 'D', 'D', 'X'}};
	
		Solution.getTreasure(arr);
		System.out.println(fin);
	}
}
