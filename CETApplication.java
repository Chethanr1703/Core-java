class CETApplication{
		static	String givenFullname;
		static	String givenUSN;
		static	String givendob;
		static	double givenXth;
		static	String givenphoneNo;

	public static boolean application(String name,String USN,String dob,double Xth,String phoneNo){
		
		boolean isCETapplication=false;
		
		boolean isApplicationValidate=CETApplicationValidate.validateApplication(name,USN,dob,Xth,phoneNo);
		if(isApplicationValidate==true){
			isCETapplication=true;
		}
		
		
		
		return isCETapplication;
	}
		
	
	public static void getDetails(){
		
			givenFullname=CETApplicationValidate.givenFullname;
			givenUSN=CETApplicationValidate.givenUSN;
			givendob=CETApplicationValidate.givendob;
			givenXth=CETApplicationValidate.givenXth;
			givenphoneNo=CETApplicationValidate.givenphoneNo;
			
			
			
		
		System.out.println("the Full name of user is "+givenFullname);
		System.out.println("the date of birth of user is "+givenUSN);
		System.out.println("the  Phone number of user is "+givendob);
		System.out.println("the address of user is "+givenXth);
		System.out.println("the date of birth of user is "+givenphoneNo);
	
	}
}