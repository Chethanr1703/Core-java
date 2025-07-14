class CareerWebsiteRunner{
	public static void main(String []carer){
		boolean isDetailsValid = CareerWebsite.givenDetails("Chethan R","chethan@gmail.com","123","123");
		System.out.println("the user Registered is"+isDetailsValid);
		
		
		if(isDetailsValid==true){
			CareerWebsite.getDetails();
		}
		
	}
}