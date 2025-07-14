class HospitalValidator{
	static int id;
	static String name;
	static long phoneNo;
	static String diseaseName;
	static String date;
	
	public static boolean ValidateRegisteration(int gId,String gName,long gPhoneNo,String gDisease,String gDate){
		boolean	isIdValid=false;
		boolean	isNameValid=false;
		boolean	isPhoneNoValid =false;
		boolean	isDeseaseValid=false;
		boolean	isDateValid=false;
		boolean isRegisterValidated=false;
		
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
			isRegisterValidated=true;
		}
		return isRegisterValidated;
		}}