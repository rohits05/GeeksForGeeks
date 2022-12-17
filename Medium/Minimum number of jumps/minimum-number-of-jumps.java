//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int l = 0, r = 0;
        int res = 0;
        
        while(r < arr.length - 1 && l <= r) {
            int farthest = 0;
            for(int i=l;i<=r;i++) farthest = Math.max(farthest, i + arr[i]);
            
            l = r + 1;
            r = farthest;
            res++;
        }
        
        if(l > r) return -1;
        return res;
    }
}