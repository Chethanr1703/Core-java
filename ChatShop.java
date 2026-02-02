class ChatShop{

	public static void main (String[]chat)	{
		String	chats[]={"1. Pani puri","2. Masala puri","3. bhel puri","4. Aloo tikki Chat","5. Samosa Chat","6. Kachori Chat","7. Chips Masala","8. Crazy Chat","9. Sev puri","10. Dahi puri"};

			System.out.println("the number of Chats are "+chats.length);
			//System.out.println(chats[0]+"  "+chats[1]+"  "+chats[2]+"  "+chats[3]+"  "+chats[4]+"  "+chats[5]+"  "+chats[6]+"  "+chats[7]+"  "+chats[8]+"  "+chats[9]);
			for(String chatName :chats){
				System.out.println(chatName);
			}
}}