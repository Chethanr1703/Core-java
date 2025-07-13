class BankRigesterationRunner{
	public static void main(String []br){
		boolean isregisterationDone = BankRigesteration.rigesteration("Chethan" ,false,"17-08-2003","Laggere",483073873313l);
		System.out.println(" the  BankRigesteration is "+isregisterationDone);
		if(isregisterationDone==true)BankRigesteration.getDetails();
		
}}
