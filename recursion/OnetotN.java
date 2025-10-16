package recursion;

public class OnetotN {
    public static void main(String[] args) {
        function(5);
    }
static void function(int n){
    if(n==0){
        return;
    }

    
    function(n-1);
    System.out.println(n);
}
}   
