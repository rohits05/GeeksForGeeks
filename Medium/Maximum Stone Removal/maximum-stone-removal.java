//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.maxRemove(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {

    class DisjointSet{
        ArrayList<Integer> parent = new ArrayList<Integer>();
        ArrayList<Integer> rank = new ArrayList<Integer>();
        public DisjointSet(int n){
            for(int i=0;i<=n;i++){
                parent.add(i);
                rank.add(1);
            }
        }
        
        public int findParent(int ele){
            if(ele==parent.get(ele)){
                return ele;
            }
            
            int par = findParent(parent.get(ele));
            parent.set(ele,par);
            return parent.get(ele);
        }
        
    public void unionByRank(int u,int v){
            int up = findParent(u);
            int vp = findParent(v);
            int ru = rank.get(u);
            int rv = rank.get(v);
            
            if(ru<rv){
                parent.set(up,vp);
            }else if(ru>rv){
                parent.set(vp,up);
            }else{
                parent.set(vp,up);
                rank.set(up,rank.get(up)+1);
            }
        }
        
    }
    
    int maxRemove(int[][] stones,int n) {
       int maxCol = Integer.MIN_VALUE;
       int maxRow = Integer.MIN_VALUE;
       HashMap<Integer,Boolean> hm = new HashMap<>();
       for(int []arr:stones){
           maxCol = Math.max(maxCol,arr[1]);
           maxRow = Math.max(maxRow,arr[0]);
           
       }
       DisjointSet obj = new DisjointSet(maxRow+maxCol+1);
       
       for(int []arr:stones){
          int u = arr[0];
          int v = arr[1]+maxRow+1;
          hm.put(u,true);
          hm.put(v,true);
          obj.unionByRank(u,v);
       }
       int count = 0;
       
       for(Map.Entry<Integer,Boolean> mp : hm.entrySet()){
           int ele = mp.getKey();
           if(ele==obj.findParent(ele)){
               count++;
           }
       }
       
       return n-count;
    }
};
