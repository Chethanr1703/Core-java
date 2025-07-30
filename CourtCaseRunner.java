class CourtCaseRunner{
	public static void main(String[]cr){
			
		String	caseType[]={"criminal","divorce","robbery","land"};
			
	
	CourtCase case1 = new CourtCase(101, "vvere");
	System.out.println("the id is  "+case1.caseId);
	System.out.println("the cleint is  "+case1.client);
	
	
	
	CourtCase case2 = new CourtCase(caseType, "shahsh");
	
	
		System.out.println("the case type is  ");
		for(String type:caseType){
				System.out.println(type);

		}

	System.out.println("the aquesedName is  "+case2.aquesedName);
	
	
	
	CourtCase case3 = new CourtCase("24-2-2023");
	
	System.out.println("the caseRegistrationDate is  "+case3.caseRegistrationDate);
	
}}