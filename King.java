class King{
	
	
	int kingId;
	String kingName[];
	String familyName;
	double kingWealth ;
	int noOfWifes;
	
	King(){
		System.out.println("the  Constructor invoked" );
	}
	King(int kingId){
		System.out.println("the Parameter Constructor invoked" );
		this.kingId=kingId;
		
	}
	King(String  kingName[],String familyName){
		this.kingName=kingName;
		this.familyName=familyName;
		
	}
	King(double kingWealth, int noOfWifes){
		
		this.kingWealth=kingWealth;
		this.noOfWifes=noOfWifes;
		
	}
	
	
	
	// public void getKingInfo(){
			// System.out.println("the king2 id is : "+kingId);
		// System.out.println("the kingName of thw king2 is  :"+kingName);
		// System.out.println("the familyName of the king2 is :"+familyName);
		// System.out.println("the kingWealth of the king2 is :"+kingWealth+"Million");
		// System.out.println("the noOfWifes of the king2 is "+noOfWifes);
		
		
		
	// }
	
	
	
}