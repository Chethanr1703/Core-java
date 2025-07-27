class Coins{
	
	Coins(){
		System.out.println("the  Constructor invoked" );
	}
	
	Coins(int coinId,int daimeterOfCoin,int coinValue,boolean isMetal,boolean isSymbolpresent){
						System.out.println("the Parameter Constructor invoked" );
	this.coinId=coinId;
	this.daimeterOfCoin=daimeterOfCoin;
	this.coinValue=coinValue;
	this.isMetal=isMetal;
	this.isSymbolpresent=isSymbolpresent;
	
		
	}
	int coinId;
	int daimeterOfCoin;
	int coinValue;
	boolean isMetal;
	boolean isSymbolpresent;
	public void getCoininfo(){
		
		System.out.println("the coinId of coin1 is : "+coinId);
		System.out.println("the daimeterOfCoin of coin1 is : "+daimeterOfCoin);
		System.out.println("the coinValue of coin1 is : "+coinValue);
		System.out.println("the isMetal of coin1 is : "+isMetal);
		System.out.println("the isSymbolpresent of coin1 is : "+isSymbolpresent);
	
	}
}