class Mobile{
	int id;
	String brandName;
	double price;
	PhoneBook phoneBook;
	
	Mobile(int id,String brandName,double price,PhoneBook phoneBook){
		this.id=id;
		this.brandName=brandName;
		this.price=price;
		this.phoneBook=phoneBook;
	}
	public void getMovieInfo(){
				System.out.println("fetching mobile info ----");
		System.out.println("the id of the mobile is :"+id);
		System.out.println("the name of the brandName : "+brandName);
		System.out.println("the noOfCountry in the price :"+price);
		
		this.phoneBook.getphoneBookInfo();

}
}