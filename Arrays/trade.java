public class trade{
    public static void main(String[] args) {
        
        int[] arr={100,180,260,310,40,535,695};
        System.out.println(trading(arr));
    }
    static int trading(int[] arr )
        {     
            int profit=0;
            for( int i=0; i<arr.length; i++ ){
                for( int j=1; j<arr.length; j++){
                    if(arr[i]>arr[j]){
                        i=j;
                    }
                    else if(arr[i]<arr[j]){
                            profit+=arr[j]-arr[i];
                            i=j;
                    
                    }    
                }
            }
            return profit;
}
}