class Company{
	int cId;
	String companyName;
	int noOffloor;
	
	
	Company(int cId,String companyName,int noOffloor){
		this.cId=cId;
		this.companyName=companyName;
		this.noOffloor=noOffloor;
	}
	public void getCompanyInfo(){
				System.out.println("fetching company info ----");
		System.out.println("the id of the company is :"+cId);
		System.out.println("the name of the company : "+companyName);
		System.out.println("the noOffloor in the company :"+noOffloor);
}}