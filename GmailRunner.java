class GmailRunner{
	public static void main(String []x){
		boolean isregisterationDone = Gmail.givenGmail("Veeresh" ,"veeresh@gmail.com",24,"chet1123","chet1123");
		System.out.println(" the  twitter is "+isregisterationDone);
		if(isregisterationDone==true)Gmail.getDetails();
		
}}
