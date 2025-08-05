class PhoneBook{
	int phoneId;
	int noOfContacts;
	Contacts contact;
	
	
	PhoneBook(int phoneId,int noOfContacts,Contacts contact){
		this.phoneId=phoneId;
		this.noOfContacts=noOfContacts;
		this.contact=contact;
	}
	public void getphoneBookInfo(){
				System.out.println("fetching PhoneBook info ----");
		System.out.println("the id of the phoneBook is :"+phoneId);
		System.out.println("the noOfContacts of the phoneBook : "+noOfContacts);
		
		this.contact.getContactInfo();
}
}