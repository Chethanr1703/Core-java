class Hospital{
	static int id;
	static String name;
	static long phoneNo;
	static String diseaseName;
	static String date;
	
	public static boolean registeration(int gId,String gName,long gPhoneNo,String gDisease,String gDate){
		
		boolean isRigerationValid=false;
		
		boolean isValidated=HospitalValidator.ValidateRegisteration( gId, gName, gPhoneNo, gDisease,gDate);
		
		if(isValidated==true){
			isRigerationValid=true;
		}
		return isRigerationValid;
		
		
		
		
	}
	
	public static void getDetails(){
			
		id=	HospitalValidator.id;
		name=	HospitalValidator.name;
		phoneNo=	HospitalValidator.phoneNo;
		diseaseName=	HospitalValidator.diseaseName;
		date= 	HospitalValidator.date;
		
		System.out.println("the id of the person"+id);
		System.out.println("the name of the person"+name);
		System.out.println("the phoneNo of the person"+phoneNo);
		System.out.println("the diseaseName of the person"+diseaseName);
		System.out.println("the date of the person"+date);
	}
}