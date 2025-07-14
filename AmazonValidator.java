class AmazonValidator{
		static String givenFullName;
		static long givenPhoneNumber;
		static String givenPassword;
		static String confirmPassword;

		public static boolean registration(String fullName,long phoneno,String password,String gconfirm){
		
		boolean isUserValidated=false;
		boolean	isFullNameValid=false;
		boolean	isPhonenumberValid = false;
		boolean	isPasswordValid =false;
		boolean isConfirmPasswordValid=false;
		
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
			isUserValidated=true;
		}else System.out.println("User is not registered ");
		return isUserValidated;
	}
}


