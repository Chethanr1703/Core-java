class AmusementParkRunner{
	public static void main(String[]apr){
		
		
	String	gameName[]={"Rain Dance","Net Walk","Hange Glider","3D"};
		
	AmusementPark park1 =new AmusementPark(1,"GRS");
	System.out.println("the id of the park1 is "+park1.amusmentParkId);
	System.out.println("the name of the park1 is "+park1.name);
	
		AmusementPark park2= new AmusementPark("Mysore","water park");
		System.out.println("the place of the amusementPark1 " + park2.place);
		System.out.println("the parkType of the amusementPark1  " + park2.parkType);
		
	AmusementPark park3= new AmusementPark(1000.50,gameName);
		System.out.println("the price of the amusementPark1 " +park3. price);
		System.out.println("the games are ");
		for(String game :gameName){
			System.out.println(game);
		}
	
		
	
	
	// AmusementPark park1 = AmusementPark(1000,gameName);
	// park1.getParkinfo();
	
	
	
}
}