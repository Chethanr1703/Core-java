class ChatShop{
	public static void getChats(){
		System.out.println("the number of Chats are "+ChatShopRunner.chats.length);
			//System.out.println(chats[0]+"  "+chats[1]+"  "+chats[2]+"  "+chats[3]+"  "+chats[4]+"  "+chats[5]+"  "+chats[6]+"  "+chats[7]+"  "+chats[8]+"  "+chats[9]);
			for(String chatName :ChatShopRunner.chats){
				System.out.println(chatName);
			}
	}
}