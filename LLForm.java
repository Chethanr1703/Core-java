class LLForm{
	static String fullName;
	static String dOB;
	static long phoneNumber;
	static String givenAddress;
	
	
	public static boolean registrationForm(String fName ,String dob,long phoneNo,String address){
	boolean	isFullNameValid = false;
	boolean	isdobValid =false;
	boolean	isphoneNoValid =false;
	boolean	isaddressValid=false;
	boolean	isregistrationFormValid=false;
		
		
		if(fName!=null){
			fullName=fName;
			isFullNameValid =true;
		}
		if(dob!=null){
			dOB=dob;
			isdobValid=true;
		}
		if(phoneNo!=0){
			phoneNumber=phoneNo;
			isphoneNoValid=true;
		}
		if(address!=null){
			givenAddress=address;
			isaddressValid=true;
		}
		if(isFullNameValid==true&&isdobValid==true&&isphoneNoValid==true && isaddressValid==true){
			isregistrationFormValid=true;
		}
		return isregistrationFormValid;
	}
	public static void getDetails(){
		System.out.println("the Full name of user is "+fullName);
		System.out.println("the date of birth of user is "+dOB);
		System.out.println("the  Phone number of user is "+phoneNumber);
		System.out.println("the address of user is "+givenAddress);
		
	}
}