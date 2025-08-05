class Galaxy {
	int galaxyId;
	String galaxyName;
	int daimeterOfGalaxy;
	SolarSystem solarSystem;
	
	Galaxy(int galaxyId,String galaxyName,int daimeterOfGalaxy,SolarSystem solarSystem){
		this.galaxyId=galaxyId;
		this.galaxyName=galaxyName;
		this.daimeterOfGalaxy=daimeterOfGalaxy;
		this.solarSystem=solarSystem;
		
	}
	public void getGalaxyInfo(){
		System.out.println("fetching galaxy info ----");
		System.out.println("the id of the galaxy is :"+galaxyId);
		System.out.println("the nameof the galaxy is: "+galaxyName);
		System.out.println("the daimeterOfGalaxy is : "+daimeterOfGalaxy);
		this.solarSystem.getSolarSystemInfo();
	}
}