//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//Back-end complete function Template for C++

class Solution {
public:
    int maxPoints(int A[], int B[], int N) {
       //code here
       map<double ,int>mp;
        int maxi = 0;
        for(int i=0; i<N; i++){
            int x = A[i];
            int y = B[i];
            for(int j=0; j<N; j++){
               if(i != j){
                    int x1 = A[j];
                    int y1 = B[j];
                    if(x1 == x) mp[INT_MAX]++;
                    else{
                        double dd = ( (y1-y) / ( (x1-x) * 1.0) );
                        mp[dd]++;
                    }
                }
            }
            
            for(auto i: mp){
                if(i.second > maxi) maxi = i.second;
            }
            mp.clear();
        }
        return maxi + 1;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int x[n], y[n];
        for(int i=0;i<n;i++){
            cin>>x[i];
        }
        for(int i=0;i<n;i++){
            cin>>y[i];
        }
        Solution ob;
        cout << ob.maxPoints(x, y, n) << endl;
    }
    return 0;
}

// } Driver Code Ends