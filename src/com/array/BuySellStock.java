package com.array;

public class BuySellStock {
    public static void main(String[] args) {
        int[] stockPrices = {7,1,5,3,6,4};

        System.out.println("Result: "+maxProfit(stockPrices));
    }
    public static int maxProfit(int[] stockPrices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : stockPrices){
            if(price < min) min = price;
            else maxProfit = Math.max(maxProfit, price-min);
        }
        return maxProfit;
    }
}
