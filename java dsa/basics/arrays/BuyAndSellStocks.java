// author: @rabhisekkar
// description: You are given an array prices where price[i] is the price
// of a given stock on the ith day. You want to maximize your profit by
// choosing a single day to buy one stock and choosing a different day in
// the future to sell that stock. Return the maximum profit you can achieve
// from this transaction. If you can't achieve any profit, return 0.

public class BuyAndSellStocks {
    public static int buyAndSellStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){    //profit
                int profit = price[i] - buyPrice;   //today's profit
                maxProfit = Math.max(maxProfit, profit);    //max profit
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};   //buy 1 sell 6, max profit = 5
        System.out.println(buyAndSellStocks(price));
    }
}

// output
// 5

// tc = O(n)