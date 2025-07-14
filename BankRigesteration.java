class BankRigesteration{
	static String fullName;
	static boolean indian;
	static String dob;
	static String address;
	static double aadhar;
	
	public static boolean rigesteration(String gName,boolean gIndian,String gDob,String gAddress,double gAadhar){
	
	boolean isRigesteratinValid =false;
	
	boolean isValidated =BankRigesterationValidator.validateBankUser(gName,gIndian,gDob,gAddress,gAadhar);
	if(isValidated ==true) {
		isRigesteratinValid=true;
	}else System.out.println("try latter");
	
	
	
	return isRigesteratinValid;
	}
	public static void getDetails(){
				fullName=BankRigesterationValidator.fullName;
				indian=BankRigesterationValidator.indian;
				dob=BankRigesterationValidator.dob;
				address=BankRigesterationValidator.address;
				aadhar=BankRigesterationValidator.aadhar;
		System.out.println("the name of the user  "+fullName);
		System.out.println("the indian of the user  "+indian);
		System.out.println("the dob is "+dob);
		System.out.println("the aadhar of the user is "+aadhar);
		
		System.out.println("the address of the user  "+address);
		
	}
}