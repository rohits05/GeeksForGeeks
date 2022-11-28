//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        int right =0, start =0, sum =0, maxSum =0;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = null; 

        while(right < n){
            if(a[right] >= 0){
                sum = sum + a[right];
                list.add(a[right]);
            }else{
                if(sum > maxSum && !list.isEmpty()){
                    ans = new ArrayList<>(list);
                    maxSum = sum;
                }
                list.clear();
                sum = 0;
            }
            right++;
        }

        if(sum > maxSum) ans = new ArrayList<>(list);

        if(ans == null){
            ans = new ArrayList<Integer>();
            ans.add(-1);
        }

        return ans;
    }
}