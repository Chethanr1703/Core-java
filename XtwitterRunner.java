class XtwitterRunner{
	public static void main(String []x){
		boolean isregisterationDone =Xtwitter.register("Veeresh" ,"veeresh@gmail.com","15-01-2003","chet1123","chet1123");
		System.out.println(" the  twitter is "+isregisterationDone);
		if(isregisterationDone==true)Xtwitter.getDetails();
		
	}
}


