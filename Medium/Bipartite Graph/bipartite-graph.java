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
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public class Graph {
        private int v;
        private ArrayList<ArrayList<Integer>> adj;

        public Graph(int v, ArrayList<ArrayList<Integer>> adj) {
            this.v = v;
            this.adj = adj;
        }

        public void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        public class Pair {
            private int vertex;
            private int color;

            public Pair(int v, int c) {
                vertex = v;
                color = c;
            }
        }

        public boolean isBipartite(){
            
            int colors[] = new int[this.v];
            Arrays.fill(colors, -1);
            Queue<Pair> queue = new LinkedList<Pair>();
            for (int u = 0; u < this.v; u++) {
                if (colors[u] == -1) {
                    queue.add(new Pair(u, 0));
                    colors[u] = 0;
                    while (!queue.isEmpty()) {
                        Pair pair = queue.poll();
                        int vertex = pair.vertex;
                        int color = pair.color;
                        for (int v : adj.get(vertex)) {
                            if (colors[v] == color)
                                return false;
                            if (colors[v] == -1) {
                                colors[v] = (color == 1) ? 0 : 1;
                                queue.add(new Pair(v, colors[v]));
                            }
                        }
                    }
                }
            }
            return true;
        }
     }
     
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj){
        // Code here
        Graph graph = new Graph(V, adj);
        if(graph.isBipartite()) return true;
        return false;
    }
}