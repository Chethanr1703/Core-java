class GoogleForm{
	static String firstName;
	static String lastName;
	static String givenEmail;
	static long phoneNumber;
	static int givenAge;
	
	public static boolean register(String fName,String lName,String email,long phoneNo,int age){
;
				boolean isFormValid=false;
		
		boolean isValidated=GoogleFormValidator.validateRegister( fName, lName, email, phoneNo, age);
		if(isValidated==true){
			isFormValid=true;
		}
		return isFormValid;
		
	}
	public static void getDetails(){
		
			firstName=GoogleFormValidator.firstName;
			lastName=GoogleFormValidator.lastName;
			givenEmail=GoogleFormValidator.givenEmail;
			phoneNumber=GoogleFormValidator.phoneNumber;
			givenAge=GoogleFormValidator.givenAge;
			
			
			
			
		System.out.println("the First name of user is "+firstName);
		System.out.println("the  Last name of user is "+lastName);
		System.out.println("the Email of user is "+givenEmail);
		System.out.println("the phone Number of user is "+phoneNumber);
		System.out.println("the age of user is "+givenAge);
	
	}
}