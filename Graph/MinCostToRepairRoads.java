

/*


Minimum cost to repair the roads(Solved using kruskals alogirtihm)

There's an undirected connected graph with n nodes labeled 1..n. But some of the edges has been broken disconnecting the graph. Find the minimum cost to repair the edges so that all the nodes are once again accessible from each other.

Input:

n, an int representing the total number of nodes.
edges, a list of integer pair representing the nodes connected by an edge.
edgesToRepair, a list where each element is a triplet representing the pair of nodes between which an edge is currently broken and the cost of repearing that edge, respectively (e.g. [1, 2, 12] means to repear an edge between nodes 1 and 2, the cost would be 12).
Example 1:

Input: n = 5, edges = [[1, 2], [2, 3], [3, 4], [4, 5], [1, 5]], edgesToRepair = [[1, 2, 12], [3, 4, 30], [1, 5, 8]]
Output: 20
Explanation:
There are 3 connected components due to broken edges: [1], [2, 3] and [4, 5].
We can connect these components into a single component by repearing the edges between nodes 1 and 2, and nodes 1 and 5 at a minimum cost 12 + 8 = 20.
Example 2:

Input: n = 6, edges = [[1, 2], [2, 3], [4, 5], [3, 5], [1, 6], [2, 4]], edgesToRepair = [[1, 6, 410], [2, 4, 800]]
Output: 410
Example 3:

Input: n = 6, edges = [[1, 2], [2, 3], [4, 5], [5, 6], [1, 5], [2, 4], [3, 4]], edgesToRepair = [[1, 5, 110], [2, 4, 84], [3, 4, 79]]
Output: 79


*/


// "static void main" must be defined in a public class.
public class MinCostToRepairRoads {
    
     int parent[];
      int connectMax= 0;
    int findMinCost(int n,int[][] edges, int[][] brokenEdges){
        
        connectMax = edges.length - brokenEdges.length;
        //System.out.println(connectMax);
        int cost=0;
        parent = new int[n+1];
        for(int i=1;i<=n;i++) parent[i] = i;
        
        for(int edge[]:edges) unionFind(edge[0],edge[1]);
        //for(int i=1;i<=n;i++) System.out.println(i+" "+parent[i]);
        
        Arrays.sort(brokenEdges, (n1,n2)->n1[2]-n2[2]);
        
        for(int brokenEdge[]:brokenEdges){
            int u = brokenEdge[0];
            int v = brokenEdge[1];
            
           // if(findSet(u)==findSet(v))continue;                     
            unionFind(u,v);
            cost+=brokenEdge[2];
            connectMax++;
            if(connectMax==n-1) return cost;
        }
        
        return -1;
    
    }
    
//     int findSet(int u){
//         int par = parent[u];
//         if(u==par) return u;
        
//         par = findSet(parent[u]);
//         return par;
//     }
    
    void unionFind(int u,int v){
        int p1 = parent[u];
        int p2 = parent[v];
        
        if(p1==p2) return;
        parent[v] = u;
    }
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        int n=5;
        int edges[][] = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        int brokenEdges[][] = {{1, 2, 12}, {3, 4, 30}, {1, 5, 8}};
        
        MinCostToRepairRoads obj = new MinCostToRepairRoads();
       System.out.println( obj.findMinCost(n,edges,brokenEdges) );
        
        int n2 = 6;
	int[][] edges2 = {{1, 2}, {2, 3}, {4, 5}, {3, 5}, {1, 6}, {2, 4}}, edgesToRepair2 = {{1, 6, 410}, {2, 4, 800}};
	System.out.println("Min Cost: " + obj.findMinCost(n2, edges2, edgesToRepair2));
	System.out.println("-------------------------------------------------");
	//System.out.println("Min Cost: " + minCostAllStartNodes(n2, edges2, edgesToRepair2));
	//System.out.println("-------------------------------------------------");
	int n3 = 6;
	int[][] edges3 = {{1, 2}, {2, 3}, {4, 5}, {5, 6}, {1, 5}, {2, 4}, {3, 4}}, edgesToRepair3 = {{1, 5, 110}, {2, 4, 84}, {3, 4, 79}};
	System.out.println("Min Cost: " + obj.findMinCost(n3, edges3, edgesToRepair3));
	//System.out.println("-------------------------------------------------");
	//System.out.println("Min Cost: " + minCostAllStartNodes(n3, edges3, edgesToRepair3));
        
    }
}