class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int dp[] = new int[n+1] ;
        for(int i =0 ; i<n ; i++){
            dp[i] =-1 ;
        }
        return fun(arr, n, 0 ,dp ) ;
    }
    
    
    
    
  static   int fun (int arr[] , int n , int i ,int dp[]){
      if (i == n){
          return 0 ;
      }
       if (i == n-1){
          return arr[n-1] ;
      }
      if(dp[i] !=-1){
          return dp[i] ;
      }
      
     int include = arr[i] + fun(arr , n , i+2 ,dp) ;
     int notincl = fun(arr , n , i+1 ,dp) ;
     
     dp[i] = Math.max(include , notincl) ;
     
     return dp[i] ;
      
      
      
      
      
  }
}
