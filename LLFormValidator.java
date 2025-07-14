class LLFormValidator{
	static String fullName;
	static String dOB;
	static long phoneNumber;
	static String givenAddress;
	static int givenAge;
	
	public static boolean validateRegistrationForm(String fName ,String dob,long phoneNo,String address,int age){
	
	boolean	isFullNameValid = false;
	boolean	isdobValid =false;
	boolean	isphoneNoValid =false;
	boolean	isaddressValid=false;
	boolean isageValid=false;
	boolean isFormValidated =false;
	
		
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
			isFormValidated=true;
		}
		return isFormValidated;
		}
		}