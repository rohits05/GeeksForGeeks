//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String str = br.readLine().trim();

            Vector<Integer> ans = new Solve().findRange(str, n);
            if (ans.size() == 1) {
                System.out.println(ans.get(0));
            } else {
                System.out.println(ans.get(0) + " " + ans.get(1));
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solve {

    Vector<Integer> findRange(String str, int n) {
        Vector<Integer> vector  = new Vector<Integer>();

        int count = 0;
        for(int i=0; i<n; i++ ) if(str.charAt(i) == '1') count++;

        if(count == n) {
            vector.add(-1);
            return vector;
        }

        int left = 0, right = 0, start = 0, sum = 0, maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(c == '1') sum -= 1;
            else sum += 1;

            if(sum  > maxi){
                maxi = sum;
                left = start;
                right = i;
            }

            if(sum < 0){
                sum = 0;
                start = i+1;
            }
        }

        vector.add(left+1);
        vector.add(right+1);
        return vector;
    }

}