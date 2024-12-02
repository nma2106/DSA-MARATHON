public class _03TillingProblem {

    public static int function(int n){
        if(n ==1||n==2){
            return n ;
        }
        int h = function(n-1);
        int v = function(n-2);
        int total = h+v;
        return total;
    }

    public static void main(String[] args) {
        int n =4;

        System.out.println(function(n));
    }
    
}
