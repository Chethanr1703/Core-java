class XworkzRigesteration{
	static String fullName;
	static String course;
	static int yearOfPass;
	static String address;
	static String branch;
	
	public static boolean rigesteration(String gName,String gCourse,int gYear,String gAddress,String gBranch){
		boolean isRigesteratinValid =false;
	
	boolean isValidated = validateUser(gName,gCourse,gYear,gAddress,gBranch);
	if(isValidated ==true ) isRigesteratinValid =true;
	
	
	return isRigesteratinValid;
	}
	public static void getDetails(){
		System.out.println("the name of the user  "+fullName);
		System.out.println("the course of the user  "+course);
		System.out.println("the yearOfPass is "+yearOfPass);
		System.out.println("the address of the user  "+address);
		System.out.println("the branchof the user is "+branch);
		
	}
	
	public static boolean validateUser(String gName,String gCourse,int gYear,String gAddress,String gBranch){
		boolean	isNameValid=false;
	boolean	isCourseValid=false;
	boolean	isAddressValid =false;
	boolean	isyearOfPassValid =false;
	boolean	isBranchValid=false;
	boolean isUserValidated =false;
	
	if(gName!=null){
		fullName=gName;
		isNameValid= true;
	}else System.out.println("please provide valid name ");
	
	if(gCourse!=null){
		course=gCourse;
		isCourseValid=true;
		
	}else System.out.println("please provide valid course ");
	
	if(gYear!=0){
		yearOfPass=gYear;
		isyearOfPassValid =true;
	}else System.out.println("please provide valid yearOfPass ");
	
	if(gAddress!=null){
		address=gAddress;
		isAddressValid =true;
	}else System.out.println("plese provide valid address");
	
	if(gBranch!=null){
		branch=gBranch;
		isBranchValid=true;
	}else System.out.println("plese provide valid branch");
	
	
	if(isNameValid&&isCourseValid&&isyearOfPassValid&&isAddressValid&&isBranchValid){
		isUserValidated =true;
	}else System.out.println("the User is not validated ........ try later  ");
	
	
	return isUserValidated;
	}
}