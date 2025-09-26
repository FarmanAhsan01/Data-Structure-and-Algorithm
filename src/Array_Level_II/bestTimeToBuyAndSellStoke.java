package Array_Level_II;

public class bestTimeToBuyAndSellStoke {
    public static int maxProfit(int prices[]){
        int n=prices.length;
            int minimal=prices[0];
        int profit=0;
        for (int i=1;i<n;i++){
            int cost=prices[i]-minimal;
            profit=Math.max(profit,cost);
            minimal= Math.min(minimal,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
