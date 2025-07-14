class Gmail{
	static String name;
	static String emailId;
	static int age;
	static String password;
	static String confirmPassword;
	public static boolean givenGmail(String fullname ,String gEmailId,int givenAge,String givenPassword,String givenCpassword){
	
	boolean	isGmailValid =false;
		
		boolean isValidated= GmailValidator.validateGmail( fullname , gEmailId, givenAge, givenPassword, givenCpassword);
		if(isValidated==true){
			isGmailValid=true;
		}
		return isGmailValid;
		
}
public static void getDetails(){
	name=GmailValidator.name;
	emailId=GmailValidator.emailId;
	age=GmailValidator.age;
	password=GmailValidator.password;
	confirmPassword=GmailValidator.confirmPassword;
	
	
		System.out.println("the given name of user is "+name);
		System.out.println("the  givenEmail of user is "+emailId);
		System.out.println("the age of user is "+age);
		System.out.println("the given password of user is "+password);
		System.out.println("the given confirm Password of user is "+confirmPassword);
	
}
}