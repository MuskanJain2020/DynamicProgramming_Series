public class countDearrangements {

    public static void main(String [] args){
        int a[] = {1,2,3,4,5};
        System.out.println(count(a,5));
    }


   public static int count(int a[] , int n) {
       if(n==1){
           return 0 ;
       }
       if(n==2){
           return 1 ;
       }

       return (n-1)*(count(a , n-1) + count(a, n-2)) ;
   }


}
