import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.size();i++){
            min=Math.min(min,prices.get(i));
            profit=Math.max(profit,prices.get(i)-min);
        }
        return profit;
    }
}