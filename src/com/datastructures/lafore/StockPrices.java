package com.datastructures.lafore;

public class StockPrices {
	public static void main(String[] args) {
		  int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};

		  int maxProfit = getMaxProfit(stockPricesYesterday);
		  // returns 6 (buying for $5 and selling for $11)
		  System.out.println("The max Profit is :-"+maxProfit);
	}
	private static int getMaxProfit( int [] stockPricesYesterday){
		if(stockPricesYesterday.length < 2){
			System.out.println("Invalid argument, to calculate profit you need atleast 2 rpices");
			return 0;
		}
		
		int maxProfit = stockPricesYesterday[1]-stockPricesYesterday[0];
		int minPrice = stockPricesYesterday[0];
		
		
		for(int currentPrice : stockPricesYesterday){
			
			minPrice = Math.min(minPrice, currentPrice);
			
			int potProfit = currentPrice - minPrice;
			maxProfit = Math.max(maxProfit, potProfit);
		}
		return maxProfit;
	}
}
