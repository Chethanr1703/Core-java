class CareerWebsiteValidate{
	static String name;
	static String emailId;
	static String password;
	static String confirmPassword;
	
	public static boolean validateUser(String gName,String gEmailId,String gPassword,String gConfirm){
		boolean isNameValid=false;
		boolean isEmailIdValid=false;
		boolean isPasswordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isUserValidated =false;
		
		
		if (gName!=null){
			name = gName;
			isNameValid=true;
			
		}else System.out.println("please give valid Name  ");
	
	
		if(gEmailId!=null){
			emailId=gEmailId;
			isEmailIdValid=true;
		}else System.out.println("please give valid Email.Id  ");
	
	
		if (gPassword!=null){
			password =gPassword;
			isPasswordValid =true;
			
		} else System.out.println("please give valid password  ");
		
	
		if(password==gConfirm && gConfirm!=null){
			confirmPassword=gConfirm;
			isConfirmPasswordValid =true;
			
		}else System.out.println("please give valid Confirm Password  ");
		
		if(isNameValid&&isEmailIdValid&&isPasswordValid&&isConfirmPasswordValid){
			isUserValidated=true;
		}else System.out.println("User is not registered  ");
		return isUserValidated;
	}
}

