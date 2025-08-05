class Planet{
	int planetId;
	String planetname;
	boolean isLife;


	Planet(int planetId,String planetname,boolean isLife){
		this.planetId=planetId;
		this.planetname=planetname;
		this.isLife=isLife;
	
}	
	public void getPlanetInfo(){
			System.out.println("fetching planet info------");
			System.out.println("the id of the planetId :"+planetId);
			System.out.println("the name of the planet is "+planetname);
			System.out.println("is life supported "+isLife);
		
					



}

}