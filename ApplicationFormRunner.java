class ApplicationFormRunner{
	
	public static void main(String [] AFR){
		String userFirstName	=ApplicationForm.fName();
		System.out.println("the First Name of the User is  "+userFirstName);
		
		String 	userLastName=ApplicationForm.lName();
		System.out.println("the Last Name of the User is  "+userLastName);
		
		String userEmail =ApplicationForm.giveneMail();
		System.out.println("the Email id of the user is "+userEmail);
		
		long phoneNo =ApplicationForm.phone();
		System.out.println("the Phone Number of the user is "+phoneNo);
		
		int userAge = ApplicationForm.givenAge();
		System.out.println("the Age of the user is "+userAge);
		
		String	userDOB	= ApplicationForm.givendob();
		System.out.println("the DOB of the user is "+userDOB);
		
		long userAadhar=ApplicationForm.givenAadhar();
		System.out.println("the Aadhar no of the user is "+userAadhar);
		
		String	userPassword=ApplicationForm.givenPassword();
		System.out.println("the password of the user is "+userPassword);
		
		boolean userForm =ApplicationForm.isValueValid();
		System.out.println("the Form of the user is "+userForm);
		
		
	}
}