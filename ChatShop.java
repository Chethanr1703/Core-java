class ChatShop{
	
	
	/*	
		static String pani ="Pani puri";
	static String masala ="Masala puri";
	static String bhel ="Bhel puri";
	static String aloo="Aloo tikki Chat";
	static String samosa="Samosa Chat";
	static String kachori="Kachori Chat";
	static String crazy="Crazy Chat";
	static String chips= "Chips Masala";
	static String sev = "Sev puri";
	static String dahi= "Dahi puri";
			
	*/	

	public static void main (String[]chat)	{
		
		
		String pani ="Pani puri";
	 String masala ="Masala puri";
	 String bhel ="Bhel puri";
	 String aloo="Aloo tikki Chat";
	 String samosa="Samosa Chat";
	 String kachori="Kachori Chat";
	 String crazy="Crazy Chat";
	 String chips= "Chips Masala";
	 String sev = "Sev puri";
	 String dahi= "Dahi puri";
		String	chats[]={pani,masala,bhel,aloo,samosa,kachori,chips,crazy,sev,dahi};

			System.out.println("the number of Chats are "+chats.length);
			//System.out.println(chats[0]+"  "+chats[1]+"  "+chats[2]+"  "+chats[3]+"  "+chats[4]+"  "+chats[5]+"  "+chats[6]+"  "+chats[7]+"  "+chats[8]+"  "+chats[9]);
			for(String chatName :chats){
				System.out.println(chatName);
			}
}}