class Solution {
    public int rob(int[] nums) {
        
        int k = nums.length ;
        
        int a =Solve(nums , 1 , k , dp) ;
        int b = Solve(nums , 0 , k ,dp ) ;
        
        System.out.println(a + " "+ b);
        
            return Math.max(a,b) ;
         
      }
    
    public static int  Solve (int []nums , int i , int n , int[]dp){
        if(i==n){
            return 0 ;
        }
        if(i == n-1){
            return nums[n-1] ;
            }
        
       
        
        int inc = nums[i] +Solve (nums , i+2 , n ,dp) ;
        int ninc = Solve(nums , i+1 , n ,dp) ;
        int ans = Math.max(inc , ninc) ;
        
        return ans ;
    }
    
    
    
    
    
    
}
