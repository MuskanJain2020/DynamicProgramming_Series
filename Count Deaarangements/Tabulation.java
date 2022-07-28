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
       dp[1] = 0 ;
       dp[2] = 1 ;
       for(int i =3; i<=n ; i++){
           dp[i] = (i-1)* (count(a,n-1,dp ) + count(a,n-2,dp ));
       }

       return dp[n] ;
   }
}
