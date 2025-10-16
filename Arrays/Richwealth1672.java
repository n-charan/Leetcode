package Arrays;

class Richwalth1672 {

    public static void main(String[] args) {
        int[][] arr={{21,2,3},{1,20,4}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans ;
    }
}