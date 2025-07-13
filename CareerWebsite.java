class CareerWebsite{
	static String name;
	static String emailId;
	static String password;
	static String confirmPassword;
	
	public static boolean givenDetails(String gName,String gEmailId,String gPassword,String gConfirm){
		boolean isNameValid=false;
		boolean isEmailIdValid=false;
		boolean isPasswordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isUserRigestered =false;
		
		
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
			isUserRigestered=true;
		}else System.out.println("User is not registered  ");

		
	return isUserRigestered;
}
public static void getDetails(){
			System.out.println("the user  Name is  "+name);
			System.out.println("the user  email Id is  "+emailId);
			
			System.out.println("the user  Password is  "+password);
			System.out.println("the user Confirm password is  "+confirmPassword);
	
}
}