class CasinoRunner{
	public static void main(String []cr){
		
		
		String gameName[] ={"poker","rummey","Soliter","Cards"};
	Casino	casino1	=	new Casino(1, 25);
	System.out.println("the id is "+casino1.casinoId);
	System.out.println("the No of game is "+casino1.noOfGames);
	
	
	Casino	casino2	=	new Casino(150, "9:00");
	
	System.out.println("the entery fee is "+casino2.entryFee);
	System.out.println("the opening time   is "+casino2.openingTime);
	
	
	
	
	Casino	casino3	=	new Casino(true,gameName);
	System.out.println("the bar is avialable "+casino3.isBarAvailable);
	System.out.println("the game name  is ");
	
	for (String game:gameName){
		System.out.println(game);
	}
	
	
	
	
	
}}