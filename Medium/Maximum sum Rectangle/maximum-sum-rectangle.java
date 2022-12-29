// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int maximumSumRectangle(int m, int n, int arr[][]) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[i][j] = arr[i][j];
                } else {
                    dp[i][j] = dp[i][j - 1] + arr[i][j];
                }
            }
        }

        int output = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                output = Math.max(output, kadane(dp, i, j, m));
            }
        }

        return output == 0 ? -1 : output;
    }

    int kadane(int[][] dp, int i, int j, int m) {
        int[] arr = new int[m];

        if (i == 0) {
            for (int k = 0; k < m; k++) {
                arr[k] = dp[k][j];
            }
        } else {
            for (int k = 0; k < m; k++) {
                arr[k] = dp[k][j] - dp[k][i - 1];
            }
        }

        int curr = 0, ans = 0;

        for (int k = 0; k < arr.length; k++) {
            curr = curr + arr[k];

            if (curr > ans)
                ans = curr;
            if (curr < 0)
                curr = 0;
        }
        return ans;
    }
};