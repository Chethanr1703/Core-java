class ForestSafari{
	
	
			ForestSafari(){
		System.out.println("the  Constructor invoked" );
	}
	ForestSafari(int forestSafariId,String  fsName,int noOfWorkers,String location, String animalType){
		this.forestSafariId=forestSafariId;
		this.fsName=fsName;
		this.noOfWorkers=noOfWorkers;
		this.location=location;
		this.animalType=animalType;
		
	}
	
	
	int forestSafariId;
	String fsName;
	int noOfWorkers;
	String location;
	String animalType;
	
	public void getForestSafariinfo(){
		System.out.println("the id of the forestSafari1 " + forestSafariId);
		System.out.println("the name of the forestSafari1 :" + fsName);
		System.out.println("the noOfWorkers of the forestSafari1 " + noOfWorkers);
		System.out.println("the location of the forestSafari1  " + location);
		System.out.println("the animalType of the forestSafari1 " + animalType);
	}

}