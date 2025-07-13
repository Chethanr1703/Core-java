class LLForm{
	static String fullName;
	static String dOB;
	static long phoneNumber;
	static String givenAddress;
	static int givenAge;

	
	
	public static boolean registrationForm(String fName ,String dob,long phoneNo,String address,int age){
	boolean	isFullNameValid = false;
	boolean	isdobValid =false;
	boolean	isphoneNoValid =false;
	boolean	isaddressValid=false;
	boolean isageValid=false;

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
		if(age!=0){
			givenAge=age;
			isageValid=true;
		}else System.out.println("please give valid age  ");
		
		if(isFullNameValid==true&&isdobValid==true&&isphoneNoValid==true && isaddressValid==true&&isageValid){
			isregistrationFormValid=true;
		}
		return isregistrationFormValid;
	}
	public static void getDetails(){
		System.out.println("the Full name of user is "+fullName);
		System.out.println("the date of birth of user is "+dOB);
		System.out.println("the  Phone number of user is "+phoneNumber);
		System.out.println("the address of user is "+givenAddress);
		System.out.println("the age of user is "+givenAge);
		
	}
}