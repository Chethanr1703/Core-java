class Coins{
	int coinId;
	int daimeterOfCoin;
	boolean isMetal;
	boolean isSymbolpresent;
	String coinsAvailable[];
	
	Coins(){
		System.out.println("the  Constructor invoked" );
	}
	
	Coins(int coinId,int daimeterOfCoin){
						System.out.println("the Parameter Constructor invoked" );
	this.coinId=coinId;
	this.daimeterOfCoin=daimeterOfCoin;
	
	}
	Coins(boolean isMetal){
	this.isMetal=isMetal;
	
	}
	Coins(boolean isSymbolpresent,String coinAvailable[]){
	this.isSymbolpresent=isSymbolpresent;
	this.coinsAvailable=coinAvailable;
	}
	
		
	
	
	// public void getCoininfo(){
		
		// System.out.println("the coinId of coin1 is : "+coinId);
		// System.out.println("the daimeterOfCoin of coin1 is : "+daimeterOfCoin);
		// System.out.println("the coinValue of coin1 is : "+coinValue);
		// System.out.println("the isMetal of coin1 is : "+isMetal);
		// System.out.println("the isSymbolpresent of coin1 is : "+isSymbolpresent);
	
	// }
}