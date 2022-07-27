public class MinimumElements {
    public static void main(String []args){
        int a[] = {1,2,3};
           
        System.out.println(
                calculate(a,4)
        );
    }


    static int calculate(int num[] , int x ){
       int dp[] = new int[x+1];
       for (int i =0 ; i<=x ; i++){
           dp[i] = -1 ;
       }
       int ans  =  solve(num , x ,dp);
       if(ans == Integer.MAX_VALUE){
         return -1 ;
     }


     return  ans ;



    }

    //Memoization
    public static int solve(int num[] , int x , int[]dp){
        if(x==0){
            return 0 ;
        }
        if(x<0){
            return Integer.MAX_VALUE ;
        }

        if(dp[x] !=-1){
            return dp[x];
        }
        int mini = Integer.MAX_VALUE ;
        for(int i =0 ; i<num.length ; i++){
            int ans = solve(num , x-num[i] ,dp);
            if(ans != Integer.MAX_VALUE ){
                mini =Math.min(mini, 1+ans);
            }
            dp[x] = mini ;

        }
        return mini ;
    }


}
