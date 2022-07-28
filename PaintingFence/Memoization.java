class Solution
{   public static long mod = 1000000007 ;
    long countWays(int n,int k)
    {  long dp[] = new long[n+1] ;
    for(int i =0 ; i<=n ; i++){
        dp[i] = -1 ;
    }
        return fun(n , k ,dp) ;
    }
    
    
    public static long  fun(int n , int k, long[]dp){
      
        if(n==1){
            return k;
        }
        
        if(n==2){
            return (k+(k*(k-1))) ;
        }
        if(dp[n] !=-1){
            return dp[n] ;
        }
     
       dp[n] =((fun(n-1,k ,dp)%mod*(k-1))+(fun(n-2,k,dp)%mod*(k-1)))%mod;
      
       return dp[n] ;
    }
}

