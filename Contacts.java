class Contacts{
	int id;
	String contactName;
	long cNumber;
	String history;
	
	
	Contacts(int id,String contactName,long cNumber,String history){
		this.id=id;
		this.contactName=contactName;
		this.cNumber=cNumber;
		this.history=history;
	}
	public void getContactInfo(){
				System.out.println("fetching contact info ----");
		System.out.println("the id of the contact is :"+id);
		System.out.println("the name of the contact : "+contactName);
		System.out.println("the cNumber in the contact :"+cNumber);
		System.out.println("the history in the contact :"+history);
		
}
}