class CareerWebsite{
	static String name;
	static String emailId;
	static String password;
	static String confirmPassword;
	
	public static boolean givenDetails(String gName,String gEmailId,String gPassword,String gConfirm){
		
		boolean isUserRigestered =false;
		
		boolean isValidated =CareerWebsiteValidate.validateUser(gName,gEmailId,gPassword,gConfirm);
		if(isValidated==true){
			isUserRigestered=true;
		}
		

		
	return isUserRigestered;
}
public static void getDetails(){
	
		name=	CareerWebsiteValidate.name;
		emailId=	CareerWebsiteValidate.emailId;
		password=	CareerWebsiteValidate.password;
		confirmPassword=	CareerWebsiteValidate.confirmPassword;
		
		
		
			System.out.println("the user  Name is  "+name);
			System.out.println("the user  email Id is  "+emailId);
			
			System.out.println("the user  Password is  "+password);
			System.out.println("the user Confirm password is  "+confirmPassword);
	
}
}