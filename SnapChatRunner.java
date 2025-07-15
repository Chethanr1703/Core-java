class SnapChatRunner{
	public static void main(String []SCR){
		String userId ="chet1708";
		String password ="1708";
		long phone =9632027324l;
		String user=SnapChat.login(userId,password);
		System.out.println(user);
		
		long phoneNumber=SnapChat.login(phone,password);
		System.out.println(phone);
	}
}