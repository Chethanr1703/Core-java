class SolarSystem{
	String solarSystemName;
	int noOfplanets;
	String lifePlanet;
	Planet planet;
	
	SolarSystem(String solarSystemName,int noOfplanets,String lifePlanet,Planet planet){
		this.solarSystemName=solarSystemName;
		this.noOfplanets=noOfplanets;
		this.lifePlanet=lifePlanet;
		this.planet=planet;
		
	}
	public void getSolarSystemInfo(){
		System.out.println("fetching SolarSystem info   -----");
		System.out.println("the name of the solarSystem:  "+solarSystemName);
		System.out.println("the noOfplanets in solarSystem is :"+noOfplanets);
		System.out.println("the lifePlanet of solarSystem is :"+lifePlanet);


this.planet.getPlanetInfo();
	}
}