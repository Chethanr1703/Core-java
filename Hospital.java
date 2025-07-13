class Hospital{
	static int id;
	static String name;
	static long phoneNo;
	static String diseaseName;
	static String date;
	
	public static boolean registeration(int gId,String gName,long gPhoneNo,String gDisease,String gDate){
		boolean	isIdValid=false;
		boolean	isNameValid=false;
		boolean	isPhoneNoValid =false;
		boolean	isDeseaseValid=false;
		boolean	isDateValid=false;
		boolean isRigerationValid=false;
		
		if(gId!=0){
			id=gId;
			isIdValid=true;
		}else System.out.println("please provide valid Id ");
		
		if(gName!=null){
			name=gName;
			isNameValid=true;
		}else System.out.println("please provide valid name ");
		
		if(gPhoneNo!=0){
			phoneNo=gPhoneNo;
			isPhoneNoValid =true;
		}else System.out.println("please provide valid phoneNo ");
		
		if(gDisease!=null){
			diseaseName=gDisease;
			isDeseaseValid=true;
		}else System.out.println("please provide valid diseaseName ");
		
		if(gDate!=null){
			date=gDate;
			isDateValid=true;
		}else System.out.println("please provide valid Date ");
		
		if(isIdValid&&isNameValid&&isPhoneNoValid&&isDeseaseValid&&isDateValid){
			isRigerationValid=true;
		}
		return isRigerationValid;
		
		
		
		
	}
	
	public static void getDetails(){
		System.out.println("the id of the person"+id);
		System.out.println("the name of the person"+name);
		System.out.println("the phoneNo of the person"+phoneNo);
		System.out.println("the diseaseName of the person"+diseaseName);
		System.out.println("the date of the person"+date);
	}
}