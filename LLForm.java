class LLForm{
	static String fullName;
	static String dOB;
	static long phoneNumber;
	static String givenAddress;
	static int givenAge;

	
	
	public static boolean registrationForm(String fName ,String dob,long phoneNo,String address,int age){
	
	boolean	isregistrationFormValid=false;
		
		boolean isFormValidated=LLFormValidator.validateRegistrationForm( fName , dob, phoneNo, address, age);
		
		if(isFormValidated==true){
			isregistrationFormValid=true;
		}
		
		return isregistrationFormValid;
	}
	public static void getDetails(){
		
			fullName=LLFormValidator.fullName;
			dOB=LLFormValidator.dOB;
			phoneNumber=LLFormValidator.phoneNumber;
			givenAddress=LLFormValidator.givenAddress;
			givenAge=LLFormValidator.givenAge;
			
			
			
		System.out.println("the Full name of user is "+fullName);
		System.out.println("the date of birth of user is "+dOB);
		System.out.println("the  Phone number of user is "+phoneNumber);
		System.out.println("the address of user is "+givenAddress);
		System.out.println("the age of user is "+givenAge);
		
	}
}