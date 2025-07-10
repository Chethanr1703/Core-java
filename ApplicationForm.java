class ApplicationForm{
	
		static String firstName;
		static String lastName;
		static String eMail;
		static long phoneNumber;
		static int age;
		static char gender;
		static String dob;
		static long aadharNo;
		static String password;
		static boolean isFormValid;
	
	public static String fName(){
		firstName="Chethan";
		return firstName;
	}
	public static String lName(){
		lastName = " R";
		return lastName;
	}
	public static String giveneMail(){
		eMail = "chethanbabu1708@gmail.com";
		return eMail;
	}
	public static long phone(){
		phoneNumber=9632027324l;
		return phoneNumber;
	}
	public static int givenAge(){
		age= 22;
		return age;
	}
	public static String givendob(){
		dob="17-08-2003";
		return dob;
	}
	public static long givenAadhar(){
		aadharNo = 483073873313l;
		return aadharNo;
	}
	public static String givenPassword(){
		password ="Chethan08@";
		return password;
	}
	public static boolean isValueValid(){
		isFormValid=true;
		return isFormValid;
	}
}