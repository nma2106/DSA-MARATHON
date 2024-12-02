public class _07LinearSearch {

    public static void function(int a[],int key){
        boolean isFound = false;
        for(int i =0;i<a.length-1;i++){
            if(a[i]==key){
                System.out.println(i);
                isFound=true;
                break;
            }
        }
        if(isFound==false){
            System.out.println("-1");
        }
        //System.out.println("-1");

    }
    

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;

        function(a,key);
    }
}
