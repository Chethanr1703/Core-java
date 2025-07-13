class GoogleForm{
	static String firstName;
	static String lastName;
	static String givenEmail;
	static long phoneNumber;
	static int givenAge;
	
	public static boolean register(String fName,String lName,String email,long phoneNo,int age){
				
				boolean isFirstNameValid =false;
				boolean isLastNameValid =false;
				boolean isEmailValid= false;
				boolean isPhoneNumberValid=false;
				boolean isageValid=false;
				boolean isFormValid=false;
		
		if(fName!=null){
			firstName=fName;
			isFirstNameValid=true;
			
		}else System.out.println("please give valid firstName  ");
		if (lName!=null){
			lastName=lName;
			isLastNameValid=true;
		}else System.out.println("please give valid lastName  ");
		if(email!=null){
			givenEmail=email;
			isEmailValid=true;
		}else System.out.println("please give valid email  ");
		if(phoneNo!=0){
			phoneNumber=phoneNo;
			isPhoneNumberValid=true;
		}else System.out.println("please give valid phoneNumber  ");
		
		if(age!=0){
			givenAge=age;
			isageValid=true;
		}else System.out.println("please give valid age  ");
		if(isFirstNameValid==true && isLastNameValid==true && isEmailValid==true &&isPhoneNumberValid==true&&isageValid==true){
			isFormValid=true;
		}
		return isFormValid;
		
	}
	public static void getDetails(){
		System.out.println("the First name of user is "+firstName);
		System.out.println("the  Last name of user is "+lastName);
		System.out.println("the Email of user is "+givenEmail);
		System.out.println("the phone Number of user is "+phoneNumber);
		System.out.println("the age of user is "+givenAge);
	
	}
}