class CoinsRunner{
	
	public static void main(String []cn){
	

		String coinAvailable[] ={"one","two","five","ten","twenty"};
	
	Coins coin1 = new Coins(1, 3);
	
	System.out.println("the id is "+coin1.coinId);
	System.out.println("the daimeter is "+coin1.daimeterOfCoin);
	
	
	
	
	Coins coin2 = new Coins( true);
	
	System.out.println("is metal    :"+coin2.isMetal);
	
	
	
	Coins coin3 = new Coins(true,coinAvailable);
	
	System.out.println("the Symbol"+coin3.isSymbolpresent);
	System.out.println("the coins that are present now are  : ");
	
	for(String coin:coinAvailable){
			System.out.println(coin);

	}
	
}}