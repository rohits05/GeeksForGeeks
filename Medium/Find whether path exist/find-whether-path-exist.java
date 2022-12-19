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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(isPossible(grid,visited,i,j,n,m)){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        
        return false;
    }
    
    // Check if path exists
    public static boolean isPossible(int[][] grid, boolean[][] visited, int i, int j, int n, int m){
        if(i<0||j<0||i>=n||j>=m||visited[i][j]||grid[i][j]==0){
            return false;
        
        if(grid[i][j]==2) return true;
        visited[i][j] = true;
        
        boolean r = isPossible(grid, visited, i, j+1, n, m);
        boolean b = isPossible(grid, visited, i+1, j, n, m);
        boolean l = isPossible(grid, visited, i, j-1, n, m);
        boolean t = isPossible(grid, visited, i-1, j, n, m);
        
        visited[i][j] = false;
        return r||b||l||t;
    }
}