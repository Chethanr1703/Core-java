class AmazonRunner{
public static void main(String []fr){
		String email ="chethan@gmail.com";
		String password ="11236523";
		long phoneNo =9632107324l;
		
		String log=FaceBook.login(email,password);
		
		
		long logedph=FaceBook.login(phoneNo,password);
		
	}
}