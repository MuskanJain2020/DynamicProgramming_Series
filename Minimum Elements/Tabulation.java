public class MinimumElements {
    public static void main(String []args){
        int a[] = {1,2,3};
             
        System.out.println(
                calculate(a,4)
        );
    }


    static int calculate(int num[] , int x ){
 


        //tabulation
        int dp[] = new int[x+1];
        for (int i =0 ; i<=x ; i++){
            dp[i] = Integer.MAX_VALUE ;
        }
        int ans  =  solvetabu(num , x ,dp);
        if(ans == Integer.MAX_VALUE){
          return -1 ;
      }

     return  ans ;



    }

  
    
   // tabulation
    public static int solvetabu(int num[] , int x , int[]dp){
        dp[0] = 0 ;

       
        for(int i =1 ; i<=x ; i++){
           for(int j = 0 ; j< num.length ; j++){
               if(i-num[j] >=0 && dp[i-num[j]] != Integer.MAX_VALUE){
                   dp[i] = Math.min(dp[i] , 1+dp[i-num[j]]);
               }
           }

    }

        return dp[x];


}}
