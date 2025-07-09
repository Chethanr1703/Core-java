class AmazonRegistrationRunner{
	static String fullName="Chethan R";
	static long phoneno =9632027324l;
	static String password = "Cheth@123";
	public static void main(String[]ARR){
		boolean isCorrectValidation =AmazonRegistration.registration(fullName,phoneno,password);
		System.out.println("the validation of the Registration "+isCorrectValidation);
		
		
		AmazonRegistration.getDetails();
		
	}
}