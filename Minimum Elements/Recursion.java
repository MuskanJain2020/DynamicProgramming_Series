public class MinimumElements {
    public static void main(String []args){
        int a[] = {1,2,3};
              calculate(a,11) ;
        System.out.println(
                calculate(a,4)
        );
    }


    static int calculate(int num[] , int x ){
       Plain Recursion
     int ans  =  solve(num , x);
     if(ans == Integer.MAX_VALUE){
         return -1 ;
     }

    return  ans ;

  }

 
    public static int solve(int num[] , int x , int[]dp){
        if(x==0){
            return 0 ;
        }
        if(x<0){
            return Integer.MAX_VALUE ;
        }

       
        int mini = Integer.MAX_VALUE ;
        for(int i =0 ; i<num.length ; i++){
            int ans = solve(num , x-num[i] ,dp);
            if(ans != Integer.MAX_VALUE ){
                mini =Math.min(mini, 1+ans);
            }
           

        }
        return mini ;
    }
  }

