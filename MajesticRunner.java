class MajesticRunner{
	public static void main(String []maje){
	//3rd	
		Bus bus1=new Bus();
		
		bus1.budId=100;
	bus1.busName="airavatha";
	bus1.diverName="ajay";
	bus1.conductorName="vijay";
	bus1.noOfSeats=40;
		
		
	//2nd	
		Platform platform1 =new Platform();
		
		platform1.id=1256;
	platform1.platformName="plat 1 ";
	platform1.noOfofficer=20;
	// custom class initial
	platform1.bus=bus1;
		
	//1st	
		Majestic majestic= new Majestic();
		
		majestic.busStopId=1;
	majestic.name="BMTC";
	majestic.noOfPlatform=15;
	majestic.platform=platform1;
	
	majestic.getMajesticInfo();
	}
}