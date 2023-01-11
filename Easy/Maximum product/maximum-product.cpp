//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	

	public:
	long long maxProductSubarrayOfSizeK(int arr[], int n, int k) 
	{ 
	    sort(arr,arr+n);
        vector<int> v(arr,arr+n);
        for(int i=0;i<n;i++){
            v.push_back(arr[i]);
        }
        int l = 0;
        int r = l+k-1;
        long long ans = INT_MIN;
        while(l < n){
            long long dum = 1;
            for(int j=l;j<=r;j++){
                dum=  dum*v[j];
            }
            ans = max(ans,dum);
            l++;
            r++;
        }
        return ans;
	}
};

//{ Driver Code Starts.
int main() 
{
   	
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n;
        cin>>n;
        int k;
        cin>>k;
        int a[n];
        for(int i=0;i<n;i++)
        cin>>a[i];

        

        Solution ob;
        cout<<ob.maxProductSubarrayOfSizeK(a,n,k);
        
	    cout << "\n";
	     
    }
    return 0;
}

// } Driver Code Ends