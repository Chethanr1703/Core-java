class MobileRunner{
	public static void main(String []mob){
		
		Contacts contact1= new Contacts(3,"chethan",9632027324l,"called 10min before");
		
		PhoneBook phoneBook1 = new PhoneBook(2,120,contact1);
		
		Mobile mobile1 =new Mobile(1,"vivo",20000.0, phoneBook1);
		
		mobile1.getMovieInfo();
	}
}