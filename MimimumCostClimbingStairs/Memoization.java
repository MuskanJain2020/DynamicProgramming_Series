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
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1] ;
        }
        if(dp[n] !=-1){
            return dp[n] ;
        }
        
        dp[n] = cost[n] +Math.min(solve(cost , n-1 ,dp ) ,solve(cost , n-2 ,dp )) ;
        return dp[n] ;
    }
}
