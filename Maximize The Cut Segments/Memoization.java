
class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       int price [] = {x,y,z} ;
       Arrays.sort(price) ;
       int dp [] = new int[n+1] ;
       for(int i =0 ; i<n+1 ; i++){
           dp[i] =-1 ;
       }
        
        int ans = func(price, n ,dp);
            if(ans == Integer.MIN_VALUE){
                return 0 ;
            }
        return ans ;
    }
    
    
    
    
    
    public static int func(int price[] , int n , int[] dp){
        if(n==0){
            return 0 ; 
        }
        
        if(n<0){
            return Integer.MIN_VALUE ;
        }
        
        if(dp[n]!=-1){
            return dp[n] ;
        }
        int mini = Integer.MIN_VALUE ;
        for (int i =0 ; i<price.length ; i++){
            int ans = func(price , n-price[i] ,dp);
                if(ans !=  Integer.MIN_VALUE){
                mini = Math.max(mini, 1+ans);
                }
            
        }
        dp[n] = mini ;
        return dp[n] ;
    
}}
