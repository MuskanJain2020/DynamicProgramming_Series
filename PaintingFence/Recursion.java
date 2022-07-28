
class Solution
{
    long countWays(int n,int k)
    {
        return fun(n , k) ;
    }
    
    
    public static long  fun(int n , int k){
        if(n== 0){
            return 0 ;
        }
        if(n==1){
            return 3 ;
        }
       
       return ((fun(n-1,k)*(k-1))+(fun(n-2,k)*(k-1)));
    }
}
