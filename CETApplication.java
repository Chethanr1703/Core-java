class CETApplication{
		static	String givenFullname;
		static	String givenUSN;
		static	String givendob;
		static	double givenXth;
		static	long givenphoneNo;

	public static boolean application(String name,String USN,String dob,double Xth,long phoneNo){
		boolean	isFullNameValid=false;
		boolean	isUSNValid=false;
		boolean isdobValid =false;
		boolean	isXthValid =false;
		boolean	isphoneNumberValid=false;
		boolean isFormValid=false;
		
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

		
		if(phoneNo!=0&&phoneNo.length<11){
			givenphoneNo=phoneNo;
			isphoneNumberValid=true;
				}else System.out.println("please give valid number  ");

		
		if(isFullNameValid==true&&isUSNValid==true&&isdobValid==true&&isXthValid==true&&isphoneNumberValid==true){
			isFormValid=true;
		}
		return isFormValid;
		
		
	}
	public static void getDetails(){
		System.out.println("the Full name of user is "+givenFullname);
		System.out.println("the date of birth of user is "+givenUSN);
		System.out.println("the  Phone number of user is "+givendob);
		System.out.println("the address of user is "+givenXth);
		System.out.println("the date of birth of user is "+givenphoneNo);
	
	}
}