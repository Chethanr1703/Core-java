class CarrerRunner{
	public static void main(String []cr){
		String userId ="chethan1708";
		String password ="170803";
		long phone =9632027324l;
		String user=Carrer.login(userId,password);
		System.out.println(user);
		
		long phoneNumber=Carrer.login(phone,password);
		System.out.println(phone);
	}
}