
/*
 A question based on the minimum spanning tree, Solved using kruskal algorithm

 Given an undirected graph with n nodes labeled 1..n. Some of the nodes are already connected. The i-th edge connects nodes edges[i][0] and edges[i][1] together. Your task is to augment this set of edges with additional edges to connect all the nodes. Find the minimum cost to add new edges between the nodes such that all the nodes are accessible from each other.

Input:

n, an int representing the total number of nodes.
edges, a list of integer pair representing the nodes already connected by an edge.
newEdges, a list where each element is a triplet representing the pair of nodes between which an edge can be added and the cost of addition, respectively (e.g. [1, 2, 5] means to add an edge between node 1 and 2, the cost would be 5).
Example 1:

Input: n = 6, edges = [[1, 4], [4, 5], [2, 3]], newEdges = [[1, 2, 5], [1, 3, 10], [1, 6, 2], [5, 6, 5]]
Output: 7
Explanation:
There are 3 connected components [1, 4, 5], [2, 3] and [6].
We can connect these components into a single component by connecting node 1 to node 2 and node 1 to node 6 at a minimum cost of 5 + 2 = 7.


*/


public class MinCostToConnectAllNodes {
    
    int connectCount=0;
    int[] parent;
    int minCostToConnectNodes(int n,int[][] edges,int[][] newEdges){
        connectCount=n;
        parent = new int[n+1];
        int cost=0;
        for(int i=1;i<=n;i++) parent[i] = i;
        
        for(int[] edge:edges) unionFind(edge[0],edge[1]);
        
        //for(int p:parent) System.out.print(p+" ");
        
        Arrays.sort(newEdges, (num1,num2)-> num1[2] - num2[2] );
       // for(int[] newEdge:newEdges) System.out.print(newEdge[2]+" ");
        
        for(int[] newEdge:newEdges){
            int u = newEdge[0];
            int v = newEdge[1];
            
            if(findSet(u)==findSet(v)) continue;
            
                unionFind(u,v);
                cost+=newEdge[2];
                   // System.out.println(cost+" "+connectCount);
                if(connectCount==1) return cost;
        }
        
        return -1;
    }
    
   int findSet(int v){
       
       int par = parent[v];
       if(v == par) return v;
        
       par = findSet(par);
       
       return par;
      
    }
    
  void unionFind(int u, int v){
        int p1 = parent[u];
        int p2 = parent[v];
        
        if(p1==p2) return;
      
        parent[v]=u;
        connectCount-=1;
    }
    
   
    public static void main(String[] args) {
		MinCostToConnectAllNodes obj = new MinCostToConnectAllNodes();
		int n = 7;
        int[][] edges = {{1, 4}, {4, 5}, {2, 3}};
        int[][] newEdges = {{1, 2, 5}, {1, 3, 10}, {1, 6, 2}, {5, 6, 5}, {3, 7, 8}};
        System.out.println(obj.minCostToConnectNodes(n, edges, newEdges));
	}

}