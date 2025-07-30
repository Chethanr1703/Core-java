class ForestSafari{
	
	int forestSafariId;
	String fsName;
	int noOfWorkers;
	String location;
	String animalType;
	String animalName[];
	
	
	
	ForestSafari(){
		System.out.println("the  Constructor invoked" );
	
	
	}
	ForestSafari(int forestSafariId,String  fsName ){
		System.out.println("the Parameter Constructor invoked" );
		this.forestSafariId=forestSafariId;
		this.fsName=fsName;
		
	}
	
	ForestSafari(String location){
		this.location=location;
		
	
	}
	ForestSafari(String animalType,String animalName[]){
	
	this.animalType=animalType;
	this.animalName=animalName;
	}
	
	
	
	// public void getForestSafariinfo(){
		// System.out.println("the id of the forestSafari1 " + forestSafariId);
		// System.out.println("the name of the forestSafari1 :" + fsName);
		// System.out.println("the noOfWorkers of the forestSafari1 " + noOfWorkers);
		// System.out.println("the location of the forestSafari1  " + location);
		// System.out.println("the animalType of the forestSafari1 " + animalType);
	// }

}