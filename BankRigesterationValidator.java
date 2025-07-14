class BankRigesterationValidator{
	static String fullName;
	static boolean indian;
	static String dob;
	static String address;
	static double aadhar;
	
	public static boolean validateBankUser(String gName,boolean gIndian,String gDob,String gAddress,double gAadhar){
	boolean	isNameValid=false;
	boolean	isindianValid=false;
	boolean	isAddressValid =false;
	boolean	isdobValid =false;
	boolean	isaadharValid=false;
	boolean	isUserValidated=false;
	
	if(gName!=null){
		fullName=gName;
		isNameValid= true;
	}else System.out.println("please provide valid name ");
	
	if(gIndian==false){
		indian=gIndian;
		isindianValid=true;
		
	}else System.out.println("please provide valid indian ");
	
	if(gDob!=null){
		dob=gDob;
		isdobValid =true;
	}else System.out.println("please provide valid dob ");
	
	if(gAddress!=null){
		address=gAddress;
		isAddressValid =true;
	}else System.out.println("please provide valid address");
	
	if(gAadhar!=0){
		aadhar=gAadhar;
		isaadharValid=true;
	}else System.out.println("please provide valid aadhar");
	
	
	if(isNameValid&&isindianValid&&isdobValid&&isAddressValid&&isaadharValid){
		isUserValidated =true;
	}else System.out.println("the rigesteration is not done");
	
	return isUserValidated;
	
	
	}
}