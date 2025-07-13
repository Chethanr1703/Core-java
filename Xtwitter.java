class Xtwitter{
	static String givenName;
	static String givenEmail;
	static String givenDob;
	static String password;
	static String confirmPassword;
	
	public static boolean register(String name ,String eMail,String dob,String gpassword,String gConfirm){
		
				boolean	isGivenNameValid=false;
				boolean isGivenEmailValid=false;
				boolean isGivenDobValid = false;
				boolean isPasswordValid=false;
				boolean isConfirmPasswordValid=false;
				boolean isFormRegistered=false;
				
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
			isFormRegistered=true;
			
		}else System.out.println("User is not registered  ");
		return isFormRegistered;
	}
	public static void getDetails(){
		System.out.println("the given name of user is "+givenName);
		System.out.println("the  givenEmail of user is "+givenEmail);
		System.out.println("the givenDob of user is "+givenDob);
		System.out.println("the given password of user is "+password);
		System.out.println("the given confirm Password of user is "+confirmPassword);
	
	}
}