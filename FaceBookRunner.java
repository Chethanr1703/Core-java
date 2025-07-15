class FaceBookRunner{
	public static void main(String []fr){
		String email ="chethan@gmail.com";
		String password ="123";
		long phoneNo =9632107324l;
		
		String log=FaceBook.login(email,password);
		
		
		long logedph=FaceBook.login(phoneNo,password);
		
	}
}