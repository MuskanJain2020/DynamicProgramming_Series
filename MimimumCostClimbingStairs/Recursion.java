class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length ;
        return      Math.min(solve(cost , n-1 ) ,solve(cost , n-2 )) ;
        
    
    }
    
    
    
    
    public static int  solve (int[]cost , int n){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1] ;
        }
        
        int ans = cost[n] +Math.min(solve(cost , n-1 ) ,solve(cost , n-2 )) ;
        return ans ;
    }
}
