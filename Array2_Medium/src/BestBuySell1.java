public class BestBuySell1 {
    public static void main(String[] args) {
        int arr[] = { 7,2,1,4,6};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int min = prices[0];
        int p =0;
        for(int i =1;i<prices.length;i++){
            int cost = prices[i]-min;
            p = Math.max(p,cost);
            min = Math.min(min,prices[i]);
        }
        return p;
    }
}
