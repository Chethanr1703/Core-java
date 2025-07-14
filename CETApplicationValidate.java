class CETApplicationValidate{
	static	String givenFullname;
		static	String givenUSN;
		static	String givendob;
		static	double givenXth;
		static	String givenphoneNo;
		
		
	public static boolean validateApplication(String name,String USN,String dob,double Xth,String phoneNo){
		
		boolean	isFullNameValid=false;
		boolean	isUSNValid=false;
		boolean isdobValid =false;
		boolean	isXthValid =false;
		boolean	isphoneNumberValid=false;
		boolean isFormValidated =false;
		
		if(name!=null){
			givenFullname=name;
			isFullNameValid=true;
		}else System.out.println("please give valid name ");

		if(USN!=null){
			givenUSN=USN;
			isUSNValid=true;
				}else System.out.println("please give valid USN  ");

		if(dob!=null){
			givendob=dob;
			isdobValid=true;
				}else System.out.println("please give valid Dob  ");

		if(Xth!=0.0){
			givenXth=Xth;
			isXthValid=true;
				}else System.out.println("please give valid percentage  ");

		
		if(phoneNo!=null){
			givenphoneNo=phoneNo;
			isphoneNumberValid=true;
				}else System.out.println("please give valid number  ");

		
		if(isFullNameValid==true&&isUSNValid==true&&isdobValid==true&&isXthValid==true&&isphoneNumberValid==true){
			isFormValidated=true;
}
		return isFormValidated;
	
	}
}
	