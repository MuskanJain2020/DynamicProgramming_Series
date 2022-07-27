class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       int price [] = {x,y,z} ;
        //code here
        
        int ans = func(price, n);
            if(ans == Integer.MIN_VALUE){
                return -1 ;
            }
        return ans ;
    }
    
    
    
    
    
    public static int func(int price[] , int n ){
        if(n==0){
            return 0 ; 
        }
        
        if(n<0){
            return Integer.MIN_VALUE ;
        }
        int mini = Integer.MIN_VALUE ;
        for (int i =0 ; i<price.length ; i++){
            int ans = func(price , n-price[i]);
                if(ans !=  Integer.MIN_VALUE){
                    mini = Math.max(mini, 1+ans);
                }
            
        }
        return mini ;
    
}}
