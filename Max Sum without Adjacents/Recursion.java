class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        
        return fun(arr, n, 0 ) ;
    }
    
    
    
    
  static   int fun (int arr[] , int n , int i ){
      if (i == n){
          return 0 ;
      }
       if (i == n-1){
          return arr[n-1] ;
      }
      
      
     int include = arr[i] + fun(arr , n , i+2) ;
     int notincl = fun(arr , n , i+1) ;
     
     return Math.max(include , notincl) ;
      
      
      
      
      
  }
}
