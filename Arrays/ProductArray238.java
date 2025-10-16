package Arrays;
//Not executed all test cases--time exceeded
import java.util.Arrays;

public class ProductArray238 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(Arrays.toString(productArray(arr)));
    }
    public static int[] productArray(int [] arr){
        int product=1;
        int[] newarr=new int[arr.length];
        for( int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product=product*arr[j];
                    newarr[i]=product;
                }

            }
            product=1;
        }
        return newarr;
    }
}
