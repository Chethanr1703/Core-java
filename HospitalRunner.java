class HospitalRunner{
	public static void main(String []hr){
		boolean registerationDone =Hospital.registeration(101,"raju",9874569856l,"cold","07-05-2025");
		System.out.println("the registeration details are  "+registerationDone);
		
		if(registerationDone==true) Hospital.getDetails();
	}
}