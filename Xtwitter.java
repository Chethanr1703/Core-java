class Xtwitter{
	static String givenName;
	static String givenEmail;
	static String givenDob;
	public static boolean register(String name ,String eMail,String dob){
		
				boolean	isGivenNameValid=false;
				boolean isGivenEmailValid=false;
				boolean isGivenDobValid = false;
				boolean isFormRegistered=false;
				
		if (name!=null){
					givenName=name;
					isGivenNameValid =true;
			
		}
		if(eMail!=null){
			givenEmail=eMail;
			isGivenEmailValid=true;
		}
		if (dob!=null){
			givenDob =dob;
			isGivenDobValid=true;
		}
		if(isGivenNameValid==true && isGivenEmailValid==true && isGivenDobValid==true){
			isFormRegistered=true;
			
		}
		return isFormRegistered;
	}
	public static void getDetails(){
		System.out.println("the given name of user is "+givenName);
		System.out.println("the  givenEmail of user is "+givenEmail);
		System.out.println("the givenDob of user is "+givenDob);
	
	}
}