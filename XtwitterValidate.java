class XtwitterValidate{
	static String givenName;
	static String givenEmail;
	static String givenDob;
	static String password;
	static String confirmPassword;
	public static boolean validateUser(String name ,String eMail,String dob,String gpassword,String gConfirm){
		
				boolean	isGivenNameValid=false;
				boolean isGivenEmailValid=false;
				boolean isGivenDobValid = false;
				boolean isPasswordValid=false;
				boolean isConfirmPasswordValid=false;
				boolean isUserValidate =false;
		if (name!=null){
					givenName=name;
					isGivenNameValid =true;
			
		}else System.out.println("please give valid Name  ");

		if(eMail!=null){
			givenEmail=eMail;
			isGivenEmailValid=true;
		}else System.out.println("please give valid eMail  ");

		if (dob!=null){
			givenDob =dob;
			isGivenDobValid=true;
		}else System.out.println("please give valid DOB  ");
		
		if(gpassword!=null){
			password =gpassword;
			isPasswordValid=true;
		}else System.out.println("please give valid password  ");
		
		if(gConfirm==password && gConfirm!=null ){
			confirmPassword=gConfirm;
			isConfirmPasswordValid =true;
			
		}else System.out.println("please give valid Confirm Password  ");
		
		
		
		if(isGivenNameValid==true && isGivenEmailValid==true && isGivenDobValid==true&&isPasswordValid&&isConfirmPasswordValid){
			isUserValidate=true;
			
		}else System.out.println("User is not registered  ");
return isUserValidate;
		
	}
}