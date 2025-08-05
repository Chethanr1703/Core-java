class GalaxyRunner{
	public static void main(String []gal){
		
		Planet planet1=new Planet(1,"mercury",false);
		
		SolarSystem solarSystem1=new SolarSystem( "planetary System", 9, "earth", planet1);
		
		Galaxy gal1 =new Galaxy(1, "Milky way", 10000, solarSystem1);
		
		gal1.getGalaxyInfo();
	}
	
}