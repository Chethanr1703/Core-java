class GmailValidator{
	static String name;
	static String emailId;
	static int age;
	static String password;
	static String confirmPassword;
	
public static boolean validateGmail(String fullname ,String gEmailId,int givenAge,String givenPassword,String givenCpassword){
	boolean	isNameValid =false;
	boolean	isEmailValid =false;
	boolean	isIntValid =false;
	boolean	isPasswordValid =false;
	boolean	isCnPassword=false;
	boolean isUserValidated=false;
	
	
	if(fullname!=null){
			name=fullname;
			isNameValid=true;
		}else System.out.println("please provid valid name");
		
		if(gEmailId!=null){
			emailId=gEmailId;
			isEmailValid=true;
		}else System.out.println("please provid valid emailId");
	
		if(givenAge!=0){
			age=givenAge;
			isIntValid=true;
		}else System.out.println("please provid valid age");
		
		if(givenPassword!=null){
			password=givenPassword;
			isPasswordValid=true;
		}else System.out.println("please provid valid password");
	
		if(givenCpassword!=null&&password==givenCpassword){
			confirmPassword=givenCpassword;
			isCnPassword=true;
		}else System.out.println("please provid valid confirmPassword");
		
		if(isNameValid&&isEmailValid&&isIntValid&&isPasswordValid&&isCnPassword){
			isUserValidated=true;
		}else System.out.println("not valid");
		return isUserValidated;
		}}