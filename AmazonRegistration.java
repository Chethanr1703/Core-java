class AmazonRegistration{
		static String givenFullName;
		static long givenPhoneNumber;
		static String givenPassword;
		static String confirmPassword;
	
	public static boolean registration(String fullName,long phoneno,String password,String gconfirm){
			
		boolean	isFullNameValid=false;
		boolean	isPhonenumberValid = false;
		boolean	isPasswordValid =false;
		boolean isConfirmPasswordValid=false;
		boolean	isRegistrationValid=false;
		
		if(fullName!=null){
			givenFullName=fullName;
			isFullNameValid=true;
		}else System.out.println("please give valid name  ");
		if(phoneno!=0){
			givenPhoneNumber=phoneno;
			isPhonenumberValid=true;
			
		}else System.out.println("please give valid phoneno  ");
		if(password!=null){
			givenPassword=password;
			isPasswordValid=true;
		}else System.out.println("please give valid password  ");
		if(password ==gconfirm ){
			confirmPassword=gconfirm;
			isConfirmPasswordValid=true;
		}else System.out.println("please give valid confirmPassword  ");
		
		if(isFullNameValid==true&&isPhonenumberValid==true&&isPasswordValid==true&&isConfirmPasswordValid){
			isRegistrationValid=true;
		}else System.out.println("User is not registered ");
		return isRegistrationValid;
	}
	public static void getDetails(){
		System.out.println("the Full name of user is "+givenFullName);
		System.out.println("the  Phone number of user is "+givenPhoneNumber);
		System.out.println("the Password of user is "+givenPassword);
		System.out.println("the confirmPassword of user is "+givenPassword);
		
	}
}