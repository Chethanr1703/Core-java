class Xtwitter{
	static String givenName;
	static String givenEmail;
	static String givenDob;
	static String password;
	static String confirmPassword;
	
	public static boolean register(String name ,String eMail,String dob,String gpassword,String gConfirm){
				boolean isFormValidated=false;
		
			boolean	isUserValidated=XtwitterValidate.validateUser( name ,eMail, dob, gpassword, gConfirm);
				if(isUserValidated==true){
					isFormValidated=true;
				}
				
		
		return isFormValidated;
	}
	public static void getDetails(){
			
			givenName=XtwitterValidate.givenName;
			givenEmail=XtwitterValidate.givenEmail;
			givenDob=XtwitterValidate.givenDob;
			password=XtwitterValidate.password;
			confirmPassword=XtwitterValidate.confirmPassword;
		
		System.out.println("the given name of user is "+givenName);
		System.out.println("the  givenEmail of user is "+givenEmail);
		System.out.println("the givenDob of user is "+givenDob);
		System.out.println("the given password of user is "+password);
		System.out.println("the given confirm Password of user is "+confirmPassword);
	
	}
}