class CETApplication{
		static	String givenFullname;
		static	String givenUSN;
		static	String givendob;
		static	double givenXth;
		static	double givenXII;
		static	long givenphoneNo;
		static	String givenAddress;
	public static boolean application(String name,String USN,String dob,double Xth,double XII,long phoneNo,String Address){
		boolean	isFullNameValid=false;
		boolean	isUSNValid=false;
		boolean isdobValid =false;
		boolean	isXthValid =false;
		boolean	isXIIValid=false;
		boolean	isphoneNumberValid=false;
		boolean	isaddressValid=false;
		boolean isFormValid=false;
		
		if(name!=null){
			givenFullname=name;
			isFullNameValid=true;
		}
		if(USN!=null){
			givenUSN=USN;
			isUSNValid=true;
		}
		if(dob!=null){
			givendob=dob;
			isdobValid=true;
		}
		if(Xth!=0.0){
			givenXth=Xth;
			isXthValid=true;
		}
		if(XII!=0.0){
			givenXII=XII;
			isXIIValid=true;
		}
		if(phoneNo!=0){
			givenphoneNo=phoneNo;
			isphoneNumberValid=true;
		}
		if(Address!=null){
			givenAddress=Address;
			isaddressValid=true;
		}
		if(isFullNameValid==true&&isUSNValid==true&&isdobValid==true&&isXthValid==true&&isXIIValid==true&&isphoneNumberValid==true&&isaddressValid==true){
			isFormValid=true;
		}
		return isFormValid;
		
		
	}
	public static void getDetails(){
		System.out.println("the Full name of user is "+givenFullname);
		System.out.println("the date of birth of user is "+givenUSN);
		System.out.println("the  Phone number of user is "+givendob);
		System.out.println("the address of user is "+givenXth);
		System.out.println("the Full name of user is "+givenXII);
		System.out.println("the date of birth of user is "+givenphoneNo);
		System.out.println("the  Phone number of user is "+givenAddress);

		
	}
}