class Library{

		public static void main (String[]book){
			String	bookNames[]={"1. The Stranger ","2. The Brothers Karamazov","3. The Bible by Unknown","4. To Kill a Mockingbird by Harper Lee","5.  Pride and Prejudice by Jane Austen","6. Crime and Punishment by Fyodor Dostoevsky","7. The Psychology Of money","8. Rich dad Poor dad"};

			System.out.println("the number of book Names are "+bookNames.length);
			//System.out.println(bookNames[0]+"  "+bookNames[1]+"  "+bookNames[2]+"  "+bookNames[3]+"  "+bookNames[4]+"  "+bookNames[5]+"  "+bookNames[6]+"  "+bookNames[7]);
			
			for(String Name:bookNames){
			System.out.println(Name);
		}

			}}
