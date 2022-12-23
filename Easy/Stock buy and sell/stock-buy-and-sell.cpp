//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

class Solution{
public:
    //Function to find the days of buying and selling stock for max profit.
    void fun(vector<int>p,int n,vector<vector<int>>& v){
        int buy=0,sell=0;
        for(int idx=1;idx<n;idx++){
            if(p[idx]<p[buy] or p[idx]<p[sell]){
                if(buy!=sell){
                    vector<int>t;
                    t.push_back(buy);
                    t.push_back(sell);
                    v.push_back(t);
                }
                buy=idx;
                sell=idx;
            }
            else if(p[idx]>p[sell])
                sell=idx;
        }
        if(buy!=sell)
            v.push_back({buy,sell});
    }
    
    vector<vector<int>>stockBuySell(vector<int> A, int n){
        // code here
        vector<vector<int>>v;
        fun(A,n,v);
        return v;
    }
};

//{ Driver Code Starts.

int check(vector<vector<int>> ans, vector<int> A, int p)
{
    int c = 0;
    for(int i=0; i<ans.size(); i++)
        c += A[ans[i][1]]-A[ans[i][0]];
    return (c==p) ? 1 : 0;
}

int main()
{   
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        for (int i=0; i<n; ++i){
            cin>>A[i];
        }
        Solution ob;
        vector<vector<int> > ans = ob.stockBuySell(A, n);
        int p = 0;
        for(int i=0; i<n-1; i++)
        {
            int x = A[i+1]-A[i];
            if(x>0)
                p += x;
        }
        if(ans.size()==0)
            cout<<"No Profit";
        else{
            cout<<check(ans,A,p);
        }cout<<endl;
    }
    return 0;
}


// } Driver Code Ends