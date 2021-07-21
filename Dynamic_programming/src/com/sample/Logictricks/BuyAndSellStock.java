package com.sample.Logictricks;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int[] prices={2,4,1};
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
	
	 public static int maxProfitold(int[] prices) {
	     
		 int buyPrice=prices[0];
		 int sellindex=0,sellPrice=0;
		 int buyindex=0;int profit=0;
		 
		 for(int i=0;i<prices.length;i++){
		 
			 if(( sellPrice - prices[i] ) > profit   && buyPrice > prices[i]){
				 buyPrice=prices[i];
			   buyindex=i;	  
			 }
			 if(sellindex > buyindex && sellPrice < prices[i])
				 sellPrice= prices[i];
			 
			 sellindex++;
			 
			 if(sellPrice < buyPrice)
				 profit= 0;
			 else
			   profit=sellPrice-buyPrice;
		 }
		 
		 
		 return profit;
	    }
}
