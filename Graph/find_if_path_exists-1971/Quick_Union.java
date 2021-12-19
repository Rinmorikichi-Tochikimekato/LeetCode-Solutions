class Quick_Union {
     //union find Simple, faster than initial
    int[] uf;
    
    public boolean validPath(int n, int[][] edges, int start, int end) {
        
    uf = new int[n];
        
    QuickUF(uf);
  
    for(int[] edge:edges){
        quickUnion(edge[0],edge[1]);
    }
    
    print(uf);
    return isConnected(start,end);
}
    
    
    
    //Print UF
    void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
    //function to init union find
    void QuickUF(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
    }
    
    //finds parent recursively
    int findParent(int i){
        while(i!=uf[i]){
            i = uf[i];
        }
        return i;
    }
    
    //function to unionize the graph
    void quickUnion(int p, int q){
        int pParent = findParent(p);
        int qParent = findParent(q);
        
       uf[qParent] = pParent;
    }
    
    //function to check if they are connected
    boolean isConnected(int p, int q){
        return findParent(p) == findParent(q);
    }
}   
