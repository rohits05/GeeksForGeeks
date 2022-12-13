//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.minimumCostPath(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Triplet {
	    int i; int j; int val;
	    Triplet(int i, int j, int val){
	        this.i = i; 
	        this.j = j;
	        this.val = val;
	    }
}

class Solution {
    public int minimumCostPath(int[][] grid) {
        // Code here
        int n = grid.length;
        int minCost[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                minCost[i][j] = Integer.MAX_VALUE;
            }
        }
        
        minCost[0][0] = grid[0][0];
        
        boolean visited[][] = new boolean[n][n];
        PriorityQueue<Triplet> pq = new PriorityQueue<>((e,f)->(e.val-f.val));
        pq.add(new Triplet(0,0,minCost[0][0]));
       
        
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,-1,1};
        
        while(!pq.isEmpty()){
            Triplet t = pq.poll();
            int x = t.i;
            int y = t.j;
            int curCost = t.val;
            if(visited[x][y]) continue;
            visited[x][y]=true;
            
            
            for(int k=0; k<4; k++){
                int ni = x+dx[k];
                int nj = y+dy[k];
                if(ni<n && nj<n && ni>=0 && nj>=0){
                    if(minCost[ni][nj]>minCost[x][y]+grid[ni][nj]){
                        minCost[ni][nj]=minCost[x][y]+grid[ni][nj];
                        pq.add(new Triplet(ni,nj,minCost[ni][nj]));
                    }
                }
            }
        }
        return minCost[n-1][n-1];
    }
}