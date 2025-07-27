class Casino{
	
	
		Casino(){
		System.out.println("the  Constructor invoked" );
	}
	Casino(int casinoId,int  noOfGames,int entryFee,String openingTime, boolean isBarAvailable){
		System.out.println("the Parameter Constructor invoked" );
		this.casinoId=casinoId;
		this.noOfGames=noOfGames;
		this.entryFee=entryFee;
		this.openingTime=openingTime;
		this.isBarAvailable=isBarAvailable;
		
	}
	
	int casinoId;
	int noOfGames;
	int entryFee;
	String openingTime;
	boolean isBarAvailable;
	
	public void getCasino(){
		
		
	System.out.println("the id of the casino1 "+casinoId);
	System.out.println("the noOfGames of the casino1 "+noOfGames);
	System.out.println("the entryFee of the casino1 "+entryFee);
	System.out.println("the openingTime of the casino1 "+openingTime);
	System.out.println("the isBarAvailable of the casino1 "+isBarAvailable);
	}
}