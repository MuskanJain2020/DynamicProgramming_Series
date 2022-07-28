
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        return solve(W, wt , val , n-1) ;
         
    } 
    
    public static int solve(int cap , int[]w , int []val , int index){
        if(index == 0 ){
            if(w[0] <= cap){
                return val[0] ;
            }
            else{
                return 0 ;
            }
        }
        
        int incl = 0 ; 
        if(w[index] <= cap){
            incl = val[index] + solve(cap-w[index] , w ,val ,index-1);
        }
        
        int exclude = solve(cap , w ,val ,index-1);
        
        return Math.max(incl ,exclude) ;
        
    
        
    }
}
