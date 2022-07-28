public class countDearrangements {

    public static void main(String [] args){
        int a[] = {1,2,3,4,5};
      int  n =a.length ;
        int dp[] = new int[n+1];
        for (int i =0 ; i<=n ; i++){
            dp[i] = -1 ;
        }

        System.out.println(count(a,n , dp));
    }


   public static int count(int a[] , int n , int []dp) {
       if(n==1){
           return 0 ;
       }
       if(n==2){
           return 1 ;
       }
       if(dp[n] !=-1){
           return dp[n] ;
       }

    dp[n] =(n-1)*(count(a , n-1 ,dp) + count(a, n-2,dp)) ;
       return dp[n];
   }
}
