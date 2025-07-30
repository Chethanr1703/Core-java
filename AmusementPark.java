class AmusementPark{

	
	int amusmentParkId;
	String name;
	String place;
	String parkType;
	String gameName[];
	double price;
	
	AmusementPark(){
		System.out.println("the  Constructor invoked" );
	}
	AmusementPark(int amusmentParkId,String  name){
		System.out.println("the Parameter Constructor invoked" );
		this.amusmentParkId=amusmentParkId;
		this.name=name;
		
		
		
	}
	AmusementPark(String place,String parkType){
		this.place=place;
		this.parkType=parkType;
	}
	AmusementPark(double price,String gameName[]){
		this.gameName=gameName;
		this.price=price;
	}
	
	// public void getParkinfo(){
		// System.out.println("the id of the amusementPark1 " + amusmentParkId);
		// System.out.println("the name of the amusementPark1 :" + name);
		// System.out.println("the place of the amusementPark1 " + place);
		// System.out.println("the parkType of the amusementPark1  " + parkType);
		// System.out.println("the price of the amusementPark1 " + price);
		// System.out.println("the games are ");
		// for(String game :gameName){
			// System.out.println(game);
		// }
		
	// }
}