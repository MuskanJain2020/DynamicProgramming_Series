
class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       int price [] = {x,y,z} ;
       Arrays.sort(price) ;
       int dp [] = new int[n+1] ;
       for(int i =0 ; i<n+1 ; i++){
           dp[i] = Integer.MIN_VALUE ;
       }
        
        int ans = func(price, n ,dp);
            if(ans == Integer.MIN_VALUE){
                return 0 ;
            }
        return ans ;
    }
    
    
    
    
    
    public static int func(int price[] , int n , int[] dp){
      dp[0] = 0;
      
      for(int i =1 ; i<=n ; i++){
          for(int j =0 ; j<price.length  ; j++){
              if(i-price[j] >=0 && dp[i-price[j]] != Integer.MIN_VALUE){
                  dp[i] = Math.max(dp[i] , dp[i-price[j]]+1);
              }
          }
      }
      return dp[n] ;
    
}}
