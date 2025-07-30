class CourtCase{
	int caseId;
	String client;
	String caseType[];
	String aquesedName;
	String caseRegistrationDate;
	
	
		CourtCase(){
			System.out.println("the  Constructor invoked" );
		
	}
	CourtCase(int caseId,String client){
		
		System.out.println("the Parameter Constructor invoked" );
		this.caseId=caseId;
		this.client=client;

		
	}
	CourtCase(String caseType[],String aquesedName){
				this.caseType=caseType;
		this.aquesedName=aquesedName;
	}
	
	CourtCase(String caseRegistrationDate){
		this.caseRegistrationDate=caseRegistrationDate;
		
	}
	
	
	// public void getcaseInfo(){
		
			// System.out.println("the id of case1 is "+caseId);
	// System.out.println("the client name of the case1 "+client);
	// System.out.println("the caseType of the case1 is "+caseType);
	// System.out.println("the aquesedName for case1 "+aquesedName);
	// System.out.println("the caseRegistrationDate of the case1 is "+caseRegistrationDate);
	// }
	
}