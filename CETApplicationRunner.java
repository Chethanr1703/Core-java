class CETApplicationRunner{
	public static void main(String []cet){
		boolean isApplicationValid= CETApplication.application("Chethan R","1ST21CS055","17-08-2003",90.88,9632027324l);
		System.out.println("the validation of the application "+isApplicationValid);
		
		if(isApplicationValid==true)CETApplication.getDetails();
	}
}