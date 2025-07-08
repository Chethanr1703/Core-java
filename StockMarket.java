class StockMarket {
	public static void getstock(){
		System.out.println("the number of stock Names are "+StockMarketRunner.stockNames.length);
			//System.out.println(stockNames[0]+"  "+stockNames[1]+"  "+stockNames[2]+"  "+stockNames[3]+"  "+stockNames[4]+"  "+stockNames[5]+"  "+stockNames[6]+"  "+stockNames[7]+"  "+stockNames[8]+"  "+stockNames[9]);
				
				
		for(String	Stock:StockMarketRunner.stockNames){
				System.out.println(Stock);
			}
}
}