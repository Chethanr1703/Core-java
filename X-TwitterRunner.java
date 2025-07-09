class XTwitterRunner{
	public static void main(String []x){
		boolean isregisterationDone =XTwitter.register("Veeresh" ,"veeresh@gmail.com","15-01-2003");
		System.out.println(" the forms of twitter is "+isregisterationDone);
		XTwitter.getDetails();
		
	}
}


