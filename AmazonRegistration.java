class AmazonRegistration{
		static String givenFullName;
		static long givenPhoneNumber;
		static String givenPassword;
		static String confirmPassword;
	
	public static boolean registration(String fullName,long phoneno,String password,String gconfirm){
			
		boolean	isRegistrationValid=false;
			
		boolean isValidated = AmazonValidator.registration( fullName, phoneno,password, gconfirm);
		
		if (isValidated==true) isRegistrationValid=true;
		return isRegistrationValid;
	}
	public static void getDetails(){
		givenFullName =AmazonValidator.givenFullName;
		givenPhoneNumber=AmazonValidator.givenPhoneNumber;
		givenPassword=AmazonValidator.givenPassword;
		confirmPassword=AmazonValidator.confirmPassword;
		
		System.out.println("the Full name of user is "+givenFullName);
		System.out.println("the  Phone number of user is "+givenPhoneNumber);
		System.out.println("the Password of user is "+givenPassword);
		System.out.println("the confirmPassword of user is "+confirmPassword);
		
	}
}