public class _04SinglePairFriends {
    public static int function(int n){
        if(n ==1||n==2){
            return n;
        }
        int single = function(n-1);
        int pair = (n-1)*function(n-2);
        int total = single +pair;
        return total;
    }
    

    public static void main(String[] args) {
        int n =3;
        System.out.println(function(n));

    }
}
