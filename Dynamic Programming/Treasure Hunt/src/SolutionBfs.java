import java.util.LinkedList;
import java.util.Queue;

public class SolutionBfs {
	
	static class coor{
		
		int x;
		int y;
		
		coor(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	
	
	static int getTreasure(char[][] arr) {
		
		 int r = arr.length;
		 int c = r==0 ? 0: arr[0].length;
		 int visited[][] = new int[r][c];
		 
		
			Queue<coor> q = new LinkedList<coor>();
			
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(arr[i][j]=='S') {
						q.add(new coor(i,j));
						visited[i][j]=1;
					}
				}
			}
			
			int steps = 0;
			
			
			while(!q.isEmpty()) {
				
				int size = q.size();
				for(int n=0;n<size;n++) {
					
					coor d = q.poll();
					int i = d.x;
					int j = d.y;
					
					 
					 if(arr[i][j]=='X') return steps;
					 
					 
					 if(i+1<r && arr[i+1][j]!='D' && visited[i+1][j]!=1) {
						 q.add(new coor(i+1,j));
						 visited[i+1][j]=1;
					 }
					 if(j+1<c && arr[i][j+1]!='D' && visited[i][j+1]!=1) {
						 q.add(new coor(i,j+1));
						 visited[i][j+1]=1;
					 }
					 if(i-1>=0 && arr[i-1][j]!='D' && visited[i-1][j]!=1) {
						 q.add(new coor(i-1,j));
						 visited[i-1][j]=1;
					 }
					 if(j-1>=0 && arr[i][j-1]!='D' && visited[i][j-1]!=1) {
						 q.add(new coor(i,j-1));
						 visited[i][j-1]=1;
					 }
					 
				}
				steps++;
				
			}
			return -1;
		 
	}
	
	
	public static void main(String[] args) {
//		System.out.println("hi");
		
		char[][] arr = {{'S', 'O', 'O', 'S', 'S'},
						{'D', 'O', 'D', 'O', 'D'},
						{'O', 'O', 'O', 'O', 'X'},
						{'X', 'D', 'D', 'O', 'O'},
						{'X', 'D', 'D', 'D', 'O'}};
		
	
		int ans = SolutionBfs.getTreasure(arr);
		System.out.print(ans);
	}
	

}
