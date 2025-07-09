class AmazonRegistration{
		static String givenFullName;
		static long givenPhoneNumber;
		static String givenPassword;
	
	public static boolean registration(String fullName,long phoneno,String password){
			
		boolean	isFullNameValid=false;
		boolean	isPhonenumberValid = false;
		boolean	isPasswordValid =false;
		boolean	isRegistrationValid=false;
		
		if(fullName!=null){
			givenFullName=fullName;
			isFullNameValid=true;
		}
		if(phoneno!=0){
			givenPhoneNumber=phoneno;
			isPhonenumberValid=true;
			
		}
		if(password!=null){
			givenPassword=password;
			isPasswordValid=true;
		}
		if(isFullNameValid==true&&isPhonenumberValid==true&&isPasswordValid==true){
			isRegistrationValid=true;
		}
		return isRegistrationValid;
	}
	public static void getDetails(){
		System.out.println("the Full name of user is "+givenFullName);
		System.out.println("the  Phone number of user is "+givenPhoneNumber);
		System.out.println("the Password of user is "+givenPassword);
		
	}
}