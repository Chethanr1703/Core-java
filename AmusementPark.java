class AmusementPark{
	
	
	AmusementPark(){
		System.out.println("the  Constructor invoked" );
	}
	AmusementPark(int amusmentParkId,String  name,String place,String parkType, double price){
		System.out.println("the Parameter Constructor invoked" );
		this.amusmentParkId=amusmentParkId;
		this.name=name;
		this.place=place;
		this.parkType=parkType;
		this.price=price;
		
	}
	
	
	
	int amusmentParkId;
	String name;
	String place;
	String parkType;
	double price;
	
	public void getParkinfo(){
		System.out.println("the id of the amusementPark1 " + amusmentParkId);
		System.out.println("the name of the amusementPark1 :" + name);
		System.out.println("the place of the amusementPark1 " + place);
		System.out.println("the parkType of the amusementPark1  " + parkType);
		System.out.println("the price of the amusementPark1 " + price);
		
	}
}