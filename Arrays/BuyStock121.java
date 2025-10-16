package Arrays;

public class BuyStock121 {
    public static void main(String[] args) {
        int [] prices={2,0,8,11};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int max_profit=0;
        for(int i=0;i< prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    int cal=prices[j]-prices[i];
                    if(cal>max_profit){
                        max_profit=cal;
                    }
                }
            }
        }
        return max_profit;
    }
}
