public class _02BestTimeToBuyStock {

    public static void function(int a []){

        int curr = Integer.MAX_VALUE;

        int profit =0;
        int maxProfit=0;
        for(int i =0;i<a.length-1;i++){
            if(curr>a[i]){
                curr=a[i];
            }
            else{
                profit = a[i]-curr;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println(maxProfit);



    }

    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        function(a);
    }
    
}
