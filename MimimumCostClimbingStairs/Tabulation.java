class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length ;
        int dp[] = new int[n+1];
        for(int i =0 ; i<=n ; i++){
            dp[i] = -1 ;
        }
        return      Math.min(solve(cost , n-1 ,dp) ,solve(cost , n-2 ,dp )) ;
        
    
    }
    
    
    
    
    public static int  solve (int[]cost , int n , int[]dp){
     dp[0] = cost[0] ;
        dp[1] = cost[1] ;
        for(int i=2 ; i<=n ; i++){
            dp[i] = Math.min(dp[i-1] , dp[i-2]) + cost[i];
        }
       
        return dp[n] ;
    }
}
