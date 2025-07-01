class Library{
	/*
	static String book1="The Stranger";
	static String book2="The Brothers Karamazov";
	static String book3="The Bible by Unknown";
	static String book4="To Kill a Mockingbird by Harper Lee";
	static String book5="Pride and Prejudice by Jane Austen";
	static String book6="Crime and Punishment by Fyodor Dostoevsky";
	static String book7="The Psychology Of money";
	static String book8= "Rich dad Poor dad";
	*/

		public static void main (String[]book){
			
			
			 String book1="The Stranger";
	 String book2="The Brothers Karamazov";
	 String book3="The Bible by Unknown";
	 String book4="To Kill a Mockingbird by Harper Lee";
	 String book5="Pride and Prejudice by Jane Austen";
	 String book6="Crime and Punishment by Fyodor Dostoevsky";
	 String book7="The Psychology Of money";
	 String book8= "Rich dad Poor dad";
			String	bookNames[]={book1,book2,book3,book4,book5,book6,book7,book8};

			System.out.println("the number of book Names are "+bookNames.length);
			//System.out.println(bookNames[0]+"  "+bookNames[1]+"  "+bookNames[2]+"  "+bookNames[3]+"  "+bookNames[4]+"  "+bookNames[5]+"  "+bookNames[6]+"  "+bookNames[7]);
			
			for(String Name:bookNames){
			System.out.println(Name);
		}

			}}
