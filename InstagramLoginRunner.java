class InstagramLoginRunner{
	public static void main(String [] login){
		String islogedin = InstagramLogin.login("chethan@gmail.com","123");
		System.out.println("the is login " +islogedin);
		
		String islogPhone = InstagramLogin.login(9632027324l,"123");
		System.out.println("the is login " +islogPhone);
	}
}