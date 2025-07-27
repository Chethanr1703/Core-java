class Politician{
	
			Politician(){
		System.out.println("the  Constructor invoked" );
	}
	Politician(int politicianId,String partyName,String partyType,String position ){
		
		System.out.println("the Parameter Constructor invoked" );
		this.politicianId=politicianId;
		this.partyName=partyName;
		this.partyType=partyType;
		this.position=position;
		
	}
	
	
	
	int politicianId;
	String partyName;
	String partyType;
	String position;
	public void getploitiInfo(){
		System.out.println("the id of the politician20: " + politicianId);
	System.out.println("the partyName of the politician20: " + partyName);
	System.out.println("the partyType of the politician20: " + partyType);
	System.out.println("the position of the politician20 is: " +position);
	}
	
}