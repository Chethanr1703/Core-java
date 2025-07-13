class AmazonRegistrationRunner{
	
	public static void main(String[]ARR){
		boolean isCorrectValidation =AmazonRegistration.registration("abhi",9632589658l,"abhi23","abhi123");
		System.out.println("the validation of the Registration "+isCorrectValidation);
		
		if(isCorrectValidation==true)AmazonRegistration.getDetails();
		
	}
}