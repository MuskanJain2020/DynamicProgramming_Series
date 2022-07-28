class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    
    { 
        
        
        int dp[][] = new int[n+1][W+1] ;
    for (int i =0 ; i<n+1 ; i++ ){
        for(int j =0 ; j<W+1 ; j++){
            dp[i][j] =-1 ;
        }
    }
        return solve(W, wt , val , n-1 ,dp) ;
         
    } 
    
    public static int solve(int cap , int[]w , int []val , int index , int[][]dp){
        if(index == 0 ){
            if(w[0] <= cap){
                return val[0] ;
            }
            else{
                return 0 ;
            }
        }
        if(dp[index][cap] !=-1){
            return dp[index][cap] ;
        }
        int incl = 0 ; 
        if(w[index] <= cap){
            incl = val[index] + solve(cap-w[index] , w ,val ,index-1 ,dp);
        }
        
        int exclude = solve(cap , w ,val ,index-1 ,dp);
        
        dp[index][cap] =Math.max(incl ,exclude) ;
        return dp[index][cap] ;
        
    
        
    }
}


