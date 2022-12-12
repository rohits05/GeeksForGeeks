//{ Driver Code Starts
// Initial Template for Java
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
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
     //Function to return Breadth First Traversal of given graph
     private void dfs(int node,int parent,boolean vis[],int tin[],int low[],
       ArrayList<ArrayList<Integer>> adj,int timer, ArrayList<Integer> a){
           vis[node] = true;
           tin[node] = low[node] = timer++;
           
           int child = 0;
           for(Integer x: adj.get(node)){
               if(x == parent) continue;
               if(!vis[x]){
                   dfs(x,node,vis,tin,low,adj,timer,a);
                   low[node] = Math.min(low[node],low[x]);
                   if(low[x] >= tin[node] && parent != -1){
                       if(!a.contains(node)) a.add(node);
                   }
                   child++;
               }else if(vis[x] && x != parent){
                   low[node] = Math.min(low[node],tin[x]);
               }
           }
           if(parent == -1 && child > 1) a.add(node);
       }
       
       public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
       {
           // Code here
           boolean vis[] = new boolean[V];
           int low[] = new int[V];
           int tin[] = new int[V];
           int timer = 0;
           ArrayList<Integer> a = new ArrayList<Integer>();
           for(int i=0; i<V; i++){
               if(!vis[i]) dfs(i,-1,vis,tin,low,adj,timer,a);
           }
           
           if(a.size() == 0){
                   a.add(-1);
                   return a;
               }
               
           Collections.sort(a);
           return a;
       }
}